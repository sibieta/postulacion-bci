package com.sibieta.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sibieta.demo.model.User;
import com.sibieta.demo.service.UserService;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;


	public UserController(UserService userService) {
        this.userService = userService;
    }

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public User getPost(@PathVariable Long id) {
		return userService.getUser(id);
	}

	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addComment(@RequestBody User user) {
        userService.addUser(user);
    }



}