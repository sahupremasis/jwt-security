package com.techprimers.security.jwtsecurity.model;

public class JwtUser {


    private String userName;
    private Long id;
    private String role;

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
