package com.example.carrentaldemo.controller;


import com.example.carrentaldemo.controller.dto.request.CustomerLoginRequest;
import com.example.carrentaldemo.controller.dto.request.CustomerRegisterRequest;
import com.example.carrentaldemo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(API.BASE)
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping(API.LOGIN_CUSTOMER)
    public void loginCustomer(@RequestBody CustomerLoginRequest loginRequest) {
        //TODO
        customerService.loginCustomer();
    }

    @PostMapping(API.REGISTER_CUSTOMER)
    public void registerCustomer(@RequestBody CustomerRegisterRequest registerRequest) {
        //TODO
        customerService.registerCustomer();
    }
}
