package com.ga.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<String> getAllUsers() {
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            users.add("User " + i);
        }
        return users;
    }
}
