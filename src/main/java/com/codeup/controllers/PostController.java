package com.codeup.controllers;
import com.codeup.model.Post;
import com.codeup.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PapoteDetres1 on 2/7/17.
 */

@Controller
public class PostController {
    private PostService service;

    @Autowired
    public PostController(PostService service){
        this.service=service;
    }


    @GetMapping("/posts")
    public String viewAllPosts(Model viewModel){
        List<Post> posts = service.findAllPost();
        viewModel.addAttribute("posts", posts);
        return "posts/index";
    }



    @GetMapping("/posts/{id}")
     public String ViewSinglePost(@PathVariable long id, Model viewModel) {
        Post post =service.findOnePost(id);
        viewModel.addAttribute("post", post);
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    public String viewCreatePostForum(Model viewModel){
        Post post= new Post(); // initial assignment

        viewModel.addAttribute("post", post);

        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String CreatePost(@ModelAttribute Post post, Model viewModel) {
        service.save(post);
        viewModel.addAttribute("post", post);

        return "posts/create";
    }
}
