package com.ry.bill.sys.controller;


import com.ry.bill.sys.common.ActiverUser;
import com.ry.bill.sys.common.WebUtils;
import com.ry.bill.sys.domain.Loginfo;
import com.ry.bill.sys.service.LoginfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ry.bill.sys.common.ResultObj;

import java.util.Date;

/**
 * @description:登录前端控制器
 * @author zzy
 * @date 2020/9/25 10:00
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginfoService loginfoService;
    @RequestMapping("login")
    public ResultObj login(String loginname,String pwd) {
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token =new UsernamePasswordToken(loginname,pwd);
        try {
            subject.login(token);
            ActiverUser activerUser = (ActiverUser) subject.getPrincipal();
            WebUtils.getSession().setAttribute("user",activerUser.getUser());
            //添加登录日志
            Loginfo entity =new Loginfo();
            entity.setLoginname(activerUser.getUser().getName()+"-"+activerUser.getUser().getLoginname());
            entity.setLoginip(WebUtils.getRequest().getRemoteAddr());
            entity.setLogintime(new Date());
            loginfoService.save(entity);
            return ResultObj.LOGIN_SUCCESS;
        }catch (AuthenticationException e){
            e.printStackTrace();
            return ResultObj.LOGIN_ERROR_PASS;
        }

    }
}

