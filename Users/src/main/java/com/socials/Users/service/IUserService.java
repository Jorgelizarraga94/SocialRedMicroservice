package com.socials.Users.service;

import com.socials.Users.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    public UserDTO getUserAndPosts(Long userId);

}
