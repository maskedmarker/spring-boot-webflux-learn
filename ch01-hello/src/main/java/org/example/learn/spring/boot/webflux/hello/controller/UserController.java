package org.example.learn.spring.boot.webflux.hello.controller;

import org.example.learn.spring.boot.webflux.hello.model.User;
import org.example.learn.spring.boot.webflux.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public Flux<User> getAllUsers() {
        return Flux.just(userService.findAllUsers().toArray(new User[0]));
    }

    @PostMapping("/createUser")
    public Mono<User> createUser(@RequestBody User user) {
        return Mono.just(userService.saveUser(user));
    }
}
