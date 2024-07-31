package com.Practise.MethodArgumentNaotValidError.Controller;

import com.Practise.MethodArgumentNaotValidError.Entity.User;
import com.Practise.MethodArgumentNaotValidError.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserRepository urepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public String save(@Valid @RequestBody User user){
        urepo.save(user);
        return "Data Saved";
    }

    @GetMapping("/all")
    public List<User> findAll(){
        return urepo.findAll();
    }
}
