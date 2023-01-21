package com.example.restfulwebservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

    @Autowired
    private  UserRepository userRepository;

    //http://localhost:8088/jpa/users or http://localhost:8088/users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){

        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        Optional<User> user = userRepository.findById(id);
        //return userRepository.getReferenceById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException(String.format("ID[%s] not found " , id));
        }
        return user.get();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }

}
