package com.myorganisation.ewallet.user52.controller;

import com.myorganisation.ewallet.user52.service.UserService;
import com.myorganisation.ewallet.user52.service.resource.UserRequest;
import com.myorganisation.ewallet.user52.service.resource.UserResponse;
import com.myorganisation.ewallet.user52.service.resource.UserTransactionRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody UserRequest userRequest) {
        userService.addUser(userRequest);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping(value = "{userId}")
    public ResponseEntity<?> getUser(@PathVariable String userId) {
        UserResponse userResponse = userService.getUser(userId);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @PutMapping(value = "{userId}")
    public ResponseEntity<?> updateUser(@Valid @RequestBody UserRequest userRequest, @PathVariable String userId) {
        UserResponse response = userService.updateUser(userRequest, userId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "{userId}/transfer")
    public ResponseEntity<?> transfer(@RequestBody UserTransactionRequest userTransactionRequest, @PathVariable String userId) {
        userService.performTransaction(userTransactionRequest, userId);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "{userId}/wallet/transfer")
    public ResponseEntity<?> userWalletUpdate(@RequestBody UserTransactionRequest userTransactionRequest, @PathVariable String userId) {
        userService.updateBalance(userTransactionRequest, userId);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }
}
