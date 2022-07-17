package com.zerobase.fastlms.history.controller;

import com.zerobase.fastlms.history.repository.LoginHistoryRepository;
import org.springframework.stereotype.Controller;

@Controller
public class LoginHistoryConstroller {

    private final LoginHistoryRepository loginHistoryRepository;

    public LoginHistoryConstroller(LoginHistoryRepository loginHistoryRepository) {
        this.loginHistoryRepository = loginHistoryRepository;
    }

}
