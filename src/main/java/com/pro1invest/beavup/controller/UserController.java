package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.User;
import com.pro1invest.beavup.repository.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;

    }

    @GetMapping("/users")
    List<User> all() {
        return userRepo.findAll();
    }

    @GetMapping("/user-login/{login}")
    User loginUser(@PathVariable String mail) {
        return userRepo.findByName(mail);
    }

    @PostMapping("/user")
    User newUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PutMapping("/user/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepo.findById(id)
                .map(user -> {
                    user.setAdress(newUser.getAdress());
                    user.setDescr((newUser.getDescr()));
                    user.setLogo(newUser.getLogo());
                    user.setMail((newUser.getMail()));
                    user.setName(newUser.getName());
                    user.setAdress((newUser.getAdress()));
                    user.setPhone((newUser.getPhone()));
                    user.setPassword(newUser.getPassword());
                    user.setTypeOfUser(newUser.getTypeOfUser());
                    return userRepo.save(user);
                }).orElseGet(() -> {
                    newUser.setId(id);
                    return userRepo.save(newUser);
                });
    }

    @DeleteMapping("users/id")
    void deletepost(@PathVariable Long id) {
        userRepo.deleteById(id);
    }

}

