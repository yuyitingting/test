package com.service;

import com.bean.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User checkUsernameAndPassword(String username, String password) {
        User user = userMapper.checkUsernameAndPassword(username, password);
        return user;
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
