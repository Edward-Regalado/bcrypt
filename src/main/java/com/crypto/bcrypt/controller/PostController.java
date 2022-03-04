//package com.crypto.bcrypt.controller;
//
//import com.crypto.bcrypt.model.Post;
//import org.springframework.stereotype.Controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.view.RedirectView;
//
//@Controller
//public class PostController {
//
//    @GetMapping("")
//    public String getPosts() {
//        return "home.html";
//    }
//
//    @PostMapping ("")
//    public RedirectView addPost(long siteUserId, String textContent){
//        Post post = new Post();
//        return new RedirectView("home");
//    }
//}
