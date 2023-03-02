package com.example.Book_My_Show.Controller;

import com.example.Book_My_Show.EntryDto.UserEntryDto;
import com.example.Book_My_Show.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public String addUser(@ResponseBody UserEntryDto userEntryDto){
      userService.addUser(userEntryDto);
      return "addedsusuccfully";
    }
}
