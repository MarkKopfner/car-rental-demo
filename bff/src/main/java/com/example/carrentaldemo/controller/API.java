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
     * REGISTRATION
     */
    public static final String REGISTER_CUSTOMER = "/v1.0/registration/customer";
}
