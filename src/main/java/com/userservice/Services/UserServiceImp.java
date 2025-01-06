package com.userservice.Services;

import com.userservice.Model.User;
import com.userservice.Repository.UserRepository;
import jakarta.ws.rs.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findFirstByEmail(username);
    }

    @Override
    public void registerUser(User user) {
        if (repository.existsByEmail(user.getEmail())) {
            throw new BadRequestException("Email en uso.");
        }
        repository.save(user);
    }
}
