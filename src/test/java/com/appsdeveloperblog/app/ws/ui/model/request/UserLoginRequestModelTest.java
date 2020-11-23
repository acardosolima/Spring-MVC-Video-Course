package com.appsdeveloperblog.app.ws.ui.model.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserLoginRequestModelTest {

    @Test
    public void userRequest_basic() {
        UserLoginRequestModel userRequest = new UserLoginRequestModel();
        userRequest.setEmail("juvjuv@gmail.com");
        userRequest.setPassword("senha123");

        assertEquals("juvjuv@gmail.com", userRequest.getEmail());
        assertEquals("senha123", userRequest.getPassword());
    }

    @Test
    public void userResponse_null() {
        UserLoginRequestModel userRequest = new UserLoginRequestModel();

        assertNull(userRequest.getEmail());
        assertNull(userRequest.getPassword());
    }

}
