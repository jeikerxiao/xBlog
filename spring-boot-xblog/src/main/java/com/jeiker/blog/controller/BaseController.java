package com.jeiker.blog.controller;

import com.jeiker.blog.model.vo.UserVo;
import com.jeiker.blog.utils.TaleUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : xiao
 * @Date : 17/7/2 上午10:40
 */
public abstract class BaseController {

    /**
     * 获取请求绑定的登录对象
     */
    public UserVo user(HttpServletRequest request) {
        return TaleUtils.getLoginUser(request);
    }

    public Integer getUid(HttpServletRequest request){
        return this.user(request).getUid();
    }
}
