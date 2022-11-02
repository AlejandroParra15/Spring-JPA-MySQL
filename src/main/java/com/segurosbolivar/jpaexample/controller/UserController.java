package com.segurosbolivar.jpaexample.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.segurosbolivar.jpaexample.api.UserAPI;
import com.segurosbolivar.jpaexample.model.User;
import com.segurosbolivar.jpaexample.service.UserService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController implements UserAPI {

	@Autowired
    private UserService userService;

    @Override
    public User getUser(UUID userId) {
        return userService.getUser(userId);
    }

    @Override
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
