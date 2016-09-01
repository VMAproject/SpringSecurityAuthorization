package com.authorization.service;



public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
