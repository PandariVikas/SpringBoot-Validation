package com.rest.service;

import com.rest.exception.IdNotFoundException;
import com.rest.model.User;
import com.rest.model.UserTemp;
import com.rest.repo.UserRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User saveUser(UserTemp userTemp){
        User user = User.build(0, userTemp.getName(), userTemp.getEmail(), userTemp.getMobileNo(), userTemp.getAge(), userTemp.getGender(), userTemp.getLocation());
//        User user= new User();
//        user.setEmail(userTemp.getEmail());
//        user.setName(userTemp.getName());
//        user.setAge(userTemp.getAge());
//        user.setGender(userTemp.getGender());
//        user.setMobileNo(userTemp.getMobileNo());
//        user.setLocation(userTemp.getLocation());
       return repo.save(user);
    }

    public User getUserBtId(Integer id) throws IdNotFoundException {
       User user = repo.findById(id).get();
        if(user!=null){
            return user;
        }
        else {
            throw new IdNotFoundException("Invalid user id"+id);
        }
    }

    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public void deleteUserById(Integer id) {
        Optional<User> user= repo.findById(id);
        if(user.isPresent()){
           repo.deleteById(id);
        }
        else {
            throw new IdNotFoundException("Invalid user id");
        }
    }

}
