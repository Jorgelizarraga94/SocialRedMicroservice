package com.socials.Posts.service;

import com.netflix.discovery.converters.Auto;
import com.socials.Posts.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostService implements IPostService{
    @Autowired
    private IPostService postService;
    @Override
    public List<Post> getPostsByUser(Long userId) {
        return postService.getPostsByUser(userId);
    }
}
