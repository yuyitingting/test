package com.service;

import com.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User checkUsernameAndPassword(String username, String password);

    int insertUser(User user);
}
