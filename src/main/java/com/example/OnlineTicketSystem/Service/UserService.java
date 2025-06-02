package com.example.OnlineTicketSystem.Service;


import com.example.OnlineTicketSystem.Repository.UserRepository;
import com.example.OnlineTicketSystem.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public User addUser(User user)
    {
        return repo.save(user);
    }

    public User findByUsername(String username) {
        return repo.findByUsername(username).orElse(null);
    }

    public List<User> getUserData()
    {
        return repo.findAll();
    }


}
