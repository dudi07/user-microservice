package com.user.service.controller;

import com.user.service.entity.User;
import com.user.service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
@Slf4j
public class UserRequestController {

    private final UserService userService;
    @GetMapping(value = "user/")
    ResponseEntity<User>getUserById(@RequestParam(value = "id")String id){
        User user = null;
        try{
            user = userService.getUserById(id);
        }catch (Exception exception){
            log.error("Exception occurred ");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
