package com.xsl.service.impl;

import com.xsl.bean.ResponseBean;
import com.xsl.bean.User;
import com.xsl.mapper.UserMapper;
import com.xsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xushilong on 2018/1/17.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ResponseBean getUserInfo() {
        ResponseBean response=new ResponseBean();
        User user=userMapper.getUserInfo();
        response.setCode(ResponseBean.CODE_SUCCESS);
        Map<String,Object> result=new HashMap<>();
        result.put("user",user);
        response.setResult(result);
        return response;
    }
}
