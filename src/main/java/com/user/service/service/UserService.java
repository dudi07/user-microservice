package com.user.service.service;

import com.user.service.entity.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(String id);
}
