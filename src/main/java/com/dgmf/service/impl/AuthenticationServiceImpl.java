package com.dgmf.service.impl;

import com.dgmf.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public Boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("John Doe");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUsername && isValidPassword;
    }
}
