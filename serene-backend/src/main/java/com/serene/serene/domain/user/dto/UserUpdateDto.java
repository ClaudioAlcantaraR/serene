package com.serene.serene.domain.user.dto;

public class UserUpdateDto {
    private String name;
    private String email;

    public UserUpdateDto() {}

    public UserUpdateDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
