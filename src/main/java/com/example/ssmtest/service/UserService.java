package com.example.ssmtest.service;

import com.example.ssmtest.pojo.User;

public interface UserService extends BaseService<User> {

    User login(String username);
}
