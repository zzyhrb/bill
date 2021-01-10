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

    /**
     * 后台首页
     *
     * @return
     */
    @RequestMapping("toDeskManager")
    public String toDeskManager(){
        return "system/index/deskManager";
    }
    /**
     * @description: 登录日志
     * @author zzy
     * @date 2021/1/6 16:12
     */
    @RequestMapping("toLogininfoManager")
    public String toLogininfoManager(){
        return "system/loginfo/loginfoManager";
    }
    /**
     * 跳转到公告管理
     *
     */
    @RequestMapping("toNoticeManager")
    public String toNoticeManager() {
        return "system/notice/noticeManager";
    }

    @RequestMapping("toDeptManager")
    public String toDeptManager(){
        return "system/dept/deptManager";
    }
    @RequestMapping("toDeptLeft")
    public String toDeptLeft(){
        return "system/dept/deptLeft";
    }
    @RequestMapping("toDeptRight")
    public String toDeptRight(){
        return "system/dept/deptRight";
    }

    /**
     *菜单管理
     * @return
     */
    @RequestMapping("toMenuManager")
    public String toMenuManager(){
        return "system/menu/menuManager";
    }

    /**
     *菜单左侧显示
     * @return
     */
    @RequestMapping("toMenuLeft")
    public String  toMenuLeft(){
        return "system/menu/menuLeft";
    }

    /**
     * 菜单右侧显示
     * @return
     */
    @RequestMapping("toMenuRight")
    public String  toMenuRight(){
        return "system/menu/menuRight";
    }

    /**
     * 权限管理
     * @return
     */
    @RequestMapping("toPermissionManager")
    public String toPermissionManager(){
        return "system/permision/permisionManager";
    }

    /**
     * 权限管理左侧
     * @return
     */

    @RequestMapping("toPermisionLeft")
    public String toPermisionLeft(){
        return "system/permision/permisionLeft";
    }

    /**
     * 权限管理右侧
     * @return
     */

    @RequestMapping("toPermisionRight")
    public String toPermisionRight(){
        return "system/permision/permisionRight";
    }

    /***
     * 角色管理
     * @return
     */
    @RequestMapping("toRoleManager")
    public String toRoleManager(){
        return "system/role/roleManager";
    }

    /**
     * 用户管理
     * @return
     */
    @RequestMapping("toUserManager")
    public String toUserManager(){
        return "system/user/userManager";
    }
    /**
     * 跳转到缓存管理
     *
     */
    @RequestMapping("toCacheManager")
    public String toCacheManager() {
        return "system/cache/cacheManager";
    }

}
