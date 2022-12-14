package com.segurosbolivar.jpaexample.api;

import com.segurosbolivar.jpaexample.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@RequestMapping("/users")
public interface UserAPI {

    @GetMapping("/{userId}")
    public User getUser(@PathVariable UUID userId);

    @PostMapping()
    public User createUser(@RequestBody User user);

    @GetMapping
    public List<User> getUsers();

}
