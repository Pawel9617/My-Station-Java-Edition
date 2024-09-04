package com.mystation.mystation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

//    @GetMapping("/{id}")
//    User getUserById(@PathVariable Integer id){
//        Optional<User> user = userService.findUserById(id);
//        if(user.isEmpty()){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.");
//        }
//        return user.get();
//    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping
//    void create(@RequestBody User user){
//        userRepository.save(user);
//    }

//    @ResponseStatus(HttpStatus.ACCEPTED)
//    @DeleteMapping("/{id}")
//    void delete(@PathVariable Integer id){
//        userService.deleteUser(id);
//    }
}