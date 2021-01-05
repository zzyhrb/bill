package com.ry.bill.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:页面跳转控制器
 * @author zzy
 * @date 2020/10/9 12:59
 */

@Controller
@RequestMapping("sys")
public class SystemController {

    /**
     * 跳转到登陆页面
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        return "system/index/login";
    }

    /**
     * 跳转到首页
     */
    @RequestMapping("index")
    public String index() {
        return "system/index/index";
    }

    @RequestMapping("toLogininfoManager")
    public String toLogininfoManager(){
        return "system/loginfo/loginfoManager";
    }


}
