package com.socials.Posts.controller;

import com.socials.Posts.model.Post;
import com.socials.Posts.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private IPostService postService;

    @Value("${server.port}")
    public int serverPort;

    @GetMapping("/{userId}")
    public List<Post> getPostsByUserId(@PathVariable Long userId){
        System.out.println("-----------Entrando en el puerto " + serverPort + " -----------" );
        return postService.getPostsByUser(userId);
    }
}
