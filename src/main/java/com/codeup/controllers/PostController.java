package com.codeup.controllers;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by PapoteDetres1 on 2/7/17.
 */

@Controller
public class PostController {
    @GetMapping("/post")
    @ResponseBody

    public String IndexPage(){
        return "<h1> Post Index Page</h1>";
    }

    @GetMapping("/post/{id}")
    @ResponseBody
     public String IndividualPost(@PathVariable long id){
        return "<h1> View your individual post, your id number is "+id+"</h1>";
    }

    @GetMapping("/post/create")
    @ResponseBody
    public String CreatePost(){
        return "<h1>This is the form for creating a post</h1>";
    }


    @PostMapping("/post/create")
    @ResponseBody
    public String CreateNewPost(){
        return "create a new post";
    }
}
