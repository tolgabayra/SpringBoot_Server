package com.tolgabayrak.SpringApiServer.controller;

import com.tolgabayrak.SpringApiServer.model.User;
import com.tolgabayrak.SpringApiServer.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}
