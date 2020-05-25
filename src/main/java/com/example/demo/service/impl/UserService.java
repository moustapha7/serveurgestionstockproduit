package com.example.demo.service.impl;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Primary
public class UserService implements ICrudService<User, Long>
{
    @Autowired
    private UserRepository usertRepository;

    @Override
    public List<User> getAll() {
        return usertRepository.findAll();
    }

    @Override
    public void add(User user) {
        usertRepository.save(user);
    }

    @Override
    public void update(User user) {
        usertRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = new User();
        user.setId(id);
        usertRepository.delete(user);
    }
}
