package com.example.carrentaldemo.utils;

import com.example.carrentaldemo.controller.dto.request.CustomerRegisterRequest;


public class ControllerObjectTestUtils {

    public static CustomerRegisterRequest CUSTOMER_REGISTER_REQUEST() {
        return new CustomerRegisterRequest(CustomerObjectTestUtils.USERNAME, CustomerObjectTestUtils.PASSWORD);
    }
}
