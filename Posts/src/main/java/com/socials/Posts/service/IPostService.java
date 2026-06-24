package com.socials.Posts.service;

import com.socials.Posts.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPostService {
    public List<Post> getPostsByUser(Long userId);
}
