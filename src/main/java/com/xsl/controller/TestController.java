package com.xsl.controller;

import com.xsl.bean.ResponseBean;
import com.xsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xushilong on 2018/1/17.
 */

@Controller
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "hao wu liao a";
    }

    @RequestMapping(value = "/user/info",method = RequestMethod.GET)
    @ResponseBody
    public ResponseBean getUserInfo(){
        return userService.getUserInfo();
    }
}
