package com.challengeSpring.Controller;

import com.challengeSpring.Model.User;
import com.challengeSpring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserRepository userDb;

    @PostMapping(value = "/" )
    public String creatUser(@RequestBody User user){

        try{

                User nuevo = new User();
                nuevo.setFirstName(user.getFirstName());
                nuevo.setLastName(user.getLastName());
                nuevo.setDateOfBirth(user.getDateOfBirth());
                nuevo.setEmail(user.getEmail());
                nuevo.setGender(user.getGender());
                nuevo.setPassword(user.getPassword());
                this.userDb.save(nuevo);

        }catch (Exception e){

            }
        return "Guardado exitosamente";

    }

    @GetMapping(value = "/{userId}")
    public String getUserId(@PathVariable("userId") Long userId){
        User getUser = this.userDb.findOne(userId);
        return ("UserId: " + getUser.getUserId());
    }
    @GetMapping(value = "/")
    public List getAll(){
        List<User> users = this.userDb.findAll();
        return users;
    }



}
