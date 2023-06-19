package com.cjss.service;

import com.cjss.exception.IdNotFoundException;
import com.cjss.model.UserModel;
import com.cjss.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private List<UserModel> userModels = new ArrayList<>();
    public List<UserModel> adduser(UserModel userModel) {
        UserModel users= new UserModel();
       users.setId(userModel.getId());
       users.setName(userModel.getName());
       users.setSalary(userModel.getSalary());
       users.setEmail(userModel.getEmail());
       userModels.add(users);
       return userModels;
    }
    public List<UserModel> getById(int id) {
        return userModels
                .stream()
                .filter( user -> user.getId()==(id))
                .collect(Collectors.toList());
    }
    public List<UserModel> getAll() {
        return userModels;
    }

    public List<UserModel> deleteById(int id) throws IdNotFoundException {
        Optional<UserModel> userModelDelete = userModels
                .stream()
                .filter(product -> product.getId()==(id))
                .findFirst();
        if(userModelDelete.isPresent()){
            userModelDelete.ifPresent(userModel -> getAll().remove(userModel));
        return userModels;
    }
     else{
         throw new IdNotFoundException("Invalid user id");
     }
    }
}
