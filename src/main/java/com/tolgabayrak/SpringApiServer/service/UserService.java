package com.tolgabayrak.SpringApiServer.service;

import com.tolgabayrak.SpringApiServer.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
