package com.appsdeveloperblog.app.ws.ui.model.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserDetailsRequestModelTest {


    @Test
    public void userRequest_basic() {
        UserDetailsRequestModel userRequest = new UserDetailsRequestModel();
        userRequest.setFirstName("Juvenal");
        userRequest.setLastName("Juvêncio");
        userRequest.setEmail("juvjuv@gmail.com");
        userRequest.setPassword("senha123");

        assertEquals("Juvenal", userRequest.getFirstName());
        assertEquals("Juvêncio", userRequest.getLastName());
        assertEquals("juvjuv@gmail.com", userRequest.getEmail());
        assertEquals("senha123", userRequest.getPassword());
    }

    @Test
    public void userResponse_null() {
        UserDetailsRequestModel userRequest = new UserDetailsRequestModel();

        assertNull(userRequest.getFirstName());
        assertNull(userRequest.getLastName());
        assertNull(userRequest.getEmail());
        assertNull(userRequest.getPassword());
    }

}