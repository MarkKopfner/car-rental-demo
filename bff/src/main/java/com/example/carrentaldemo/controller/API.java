package com.example.carrentaldemo.controller;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class API {

    /**
     * BASE
     */
    public static final String BASE = "/api/car-rental";

    /**
     * CUSTOMER
     */
    public static final String REGISTER_CUSTOMER = "/v1.0/customer/register";
    public static final String LOGIN_CUSTOMER = "/v1.0/customer/login";
}
