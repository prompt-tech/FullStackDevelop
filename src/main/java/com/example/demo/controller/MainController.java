package com.example.demo.controller;
import com.example.demo.User;
import com.example.demo.controller.MainController;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired private UserRepository userRepository;

    @RequestMapping
    public @ResponseBody String index(){
        return "Hello Hyoungseo's springboot ";
    }

    @RequestMapping("/users")
    public @ResponseBody List<User> getUserList(){
        return userRepository.findAll();

    }

}