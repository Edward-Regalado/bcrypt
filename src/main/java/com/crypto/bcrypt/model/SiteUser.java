package com.crypto.bcrypt.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class SiteUser {

    @Id
    long id;
    String username;
    String password;
//    List<Post> post;

    public SiteUser(){
        // default constructor need for JPA
    }

    public SiteUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Post> getPosts(){
//        return post;
//    }
}
