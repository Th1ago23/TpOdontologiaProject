package com.tpodontologia.backend.controller;

import com.tpodontologia.backend.model.User;
import com.tpodontologia.backend.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<User> saveUser(@RequestBody @Valid User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("/{id}")
    public Optional<User> findById (@PathVariable Long id){
        return userRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById (@PathVariable  Long id){
        userRepository.deleteById(id);
    }

}
