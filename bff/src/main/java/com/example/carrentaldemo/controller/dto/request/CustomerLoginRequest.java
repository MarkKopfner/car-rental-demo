package com.example.carrentaldemo.controller.dto.request;

import lombok.Value;

@Value
public class CustomerLoginRequest {
    String username;
    String password;
}
