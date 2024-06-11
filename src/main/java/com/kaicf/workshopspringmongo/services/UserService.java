package com.kaicf.workshopspringmongo.services;

import com.kaicf.workshopspringmongo.domain.User;
import com.kaicf.workshopspringmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
