package com.socials.Users.service;

import com.netflix.discovery.converters.Auto;
import com.socials.Users.dto.PostDTO;
import com.socials.Users.dto.UserDTO;
import com.socials.Users.model.User;
import com.socials.Users.repository.IPostApi;
import com.socials.Users.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IPostApi postApi;
    @Override
    public UserDTO getUserAndPosts(Long userId) {
        //Datos del usuario de la DB
        User user = userRepository.findById(userId).orElse(null);
        //Una vez que tengo los datos necesito los posteos

        List<PostDTO> postsList = postApi.getPostsByUserId(userId);
        //Traigo posteos desde la api de posteos
        UserDTO userDTO = new UserDTO(user.getUserId(), user.getName(), user.getLastName(), user.getCellPhone(), postsList);

        return userDTO;
    }
}
