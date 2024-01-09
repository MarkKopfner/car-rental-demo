package com.example.carrentaldemo.controller;

import com.example.carrentaldemo.controller.dto.request.CustomerRegisterRequest;
import com.example.carrentaldemo.service.CustomerService;
import com.example.carrentaldemo.service.impl.CustomerServiceImpl;
import com.example.carrentaldemo.utils.ControllerObjectTestUtils;
import com.example.carrentaldemo.utils.CustomerObjectTestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.doNothing;

@ExtendWith(SpringExtension.class)
public class CustomerControllerTest {

    @InjectMocks
    private CustomerController customerController;

    @Mock
    private CustomerServiceImpl customerService;

    @Test
    @DisplayName("GIVEN RegisterCustomerRequest WHEN RegisterCustomer THEN return OK")
    void givenRegisterCustomerRequest_whenRegisterCustomer_thenReturnOk() {
        // Given
        final CustomerRegisterRequest customerRegisterRequest = ControllerObjectTestUtils.CUSTOMER_REGISTER_REQUEST();

        // When
        customerController.registerCustomer(customerRegisterRequest);

        // Then
        verify(customerService).registerCustomer();
    }
}
