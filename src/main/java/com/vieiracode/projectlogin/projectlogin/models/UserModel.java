package com.vieiracode.projectlogin.projectlogin.models;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class UserModel {

    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column//(unique = true)
    private String email;

    @Column
    private String name;

    @Column
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
