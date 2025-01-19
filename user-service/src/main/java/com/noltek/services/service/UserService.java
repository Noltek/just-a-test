package com.noltek.services.service;

import com.noltek.services.model.entity.User;

public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}
