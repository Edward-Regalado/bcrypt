//package com.crypto.bcrypt.model;
//
//import javax.persistence.*;
//
//@Entity
//public class Post {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    long id;
//    String textContent;
//
//    @ManyToOne
//    SiteUser siteUser;
//
//    public Post(){
//    }
//
//    public Post(String textContent, SiteUser siteUser) {
//        this.textContent = textContent;
//        this.siteUser = siteUser;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getTextContent() {
//        return textContent;
//    }
//
//    public void setTextContent(String textContent) {
//        this.textContent = textContent;
//    }
//
//    public SiteUser getSiteUser() {
//        return siteUser;
//    }
//
//    public void setSiteUser(SiteUser siteUser) {
//        this.siteUser = siteUser;
//    }
//
//}
