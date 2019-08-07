package com.mapper;

import com.bean.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;

public interface UserMapper {
    //检查用户名和密码是否匹配
    User checkUsernameAndPassword(@Param("username" )String username, @Param("password") String password);

    //用户注册
    int insertUser(@Param("user")User user);
}
