package com.mystation.mystation;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

//    public Optional<User> findUserById(Integer id){
//        return userRepository.findById(id);
//    }

//    public void createUser(String userName){
//        userRepository.save(userName);
//    }

//    public void deleteUser(Integer id){
//        userRepository.deleteById(id);
//    }
}
