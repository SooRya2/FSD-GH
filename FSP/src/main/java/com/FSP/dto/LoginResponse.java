package com.FSP.dto;

import java.util.Map;

public class LoginResponse {
    private Map<String, String> jwt;
    private LoginDTO loginDTO;

    // Getters and setters
    public Map<String, String> getJwt() {
        return jwt;
    }

    public void setJwt(Map<String, String> jwt) {
        this.jwt = jwt;
    }

    public LoginDTO getLoginDTO() {
        return loginDTO;
    }

    public void setLoginDTO(LoginDTO loginDTO) {
        this.loginDTO = loginDTO;
    }
}