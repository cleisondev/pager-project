package com.cleison.nunes.pager.Presentation;

import com.cleison.nunes.pager.Application.Services.UserService;
import com.cleison.nunes.pager.Domain.User.User;
import com.cleison.nunes.pager.Domain.User.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService _userService;

    public UserController(UserService _userService) {
        this._userService = _userService;
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody UserDTO userData){

        User newUser = this._userService.create(userData);
        return ResponseEntity.ok().body(newUser);
    };

}
