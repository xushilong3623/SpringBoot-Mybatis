package com.xsl.mapper;

import com.xsl.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xushilong on 2018/1/17.
 */


public interface UserMapper {


    /**
     *
     * @return
     */
    @Select("SELECT id,name,age,sex FROM user LIMIT 1")
    User getUserInfo();
}
