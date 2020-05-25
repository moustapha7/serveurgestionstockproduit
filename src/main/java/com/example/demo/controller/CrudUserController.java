package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/crud_user")
@CrossOrigin
public class CrudUserController
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ICrudService<User, Long> iCrudService;

    @GetMapping
    public List<User> getUsers()
    {
        return iCrudService.getAll();
    }


    @PostMapping
    public void addUser(@RequestBody User user)
    {
        iCrudService.add(user);
    }


    @PutMapping
    public void updateUser(@RequestBody User user)
    {
        iCrudService.update(user);
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        iCrudService.delete(id);
    }






}
