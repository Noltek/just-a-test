package com.noltek.services.service;

import com.noltek.services.model.User;

public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}
