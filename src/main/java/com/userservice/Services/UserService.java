package com.userservice.Services;

import com.userservice.Model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void registerUser(User user);
}
