package com.authorization.service;


import com.authorization.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
