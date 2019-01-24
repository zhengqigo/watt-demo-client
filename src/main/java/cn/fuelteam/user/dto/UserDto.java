package cn.fuelteam.user.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable {

    private static final long serialVersionUID = 3826838176926648421L;

    private Long id;

    private String username;

    private String password;

    private String address;

    private Date createdAt;

    public Long getId() {
        return id;
    }

    public UserDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserDto setUsername(String username) {
        this.username = username == null ? null : username.trim();
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password == null ? null : password.trim();
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserDto setAddress(String address) {
        this.address = address == null ? null : address.trim();
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public UserDto setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}