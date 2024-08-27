package com.mystation.mystation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable Integer id){
        Optional<User> user = userService.findUserById(id);
        if(user.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.");
        }
        return user.get();
    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping
//    void create(@RequestBody User user){
//        userRepository.save(user);
//    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}