package com.serene.serene.domain.user.dto;

public class UserLoginDto {

    private String email;
    private String password;

    public UserLoginDto() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
