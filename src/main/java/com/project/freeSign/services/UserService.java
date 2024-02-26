package com.project.freeSign.services;

import com.project.freeSign.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Manmeet Kalra", "manmeet@kalra.com"));
        store.add(new User(UUID.randomUUID().toString(),"Simar Kalra", "simar@kalra.com"));
    }

    public List<User> getUsers(){
        return store;
    }
}
