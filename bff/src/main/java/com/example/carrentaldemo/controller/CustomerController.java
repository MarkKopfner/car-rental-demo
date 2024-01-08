package com.example.carrentaldemo.controller;


import com.example.carrentaldemo.controller.dto.request.CustomerLoginRequest;
import com.example.carrentaldemo.controller.dto.request.CustomerRegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(API.BASE)
public class CustomerController {

    @PostMapping(API.LOGIN_CUSTOMER)
    public void loginCustomer(@RequestBody CustomerLoginRequest loginRequest) {
        System.out.println(loginRequest.getUsername());
        System.out.println(loginRequest.getPassword());
    }

    @PostMapping(API.REGISTER_CUSTOMER)
    public void registerCustomer(@RequestBody CustomerRegisterRequest registerRequest) {

    }
}
