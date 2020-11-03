package com.appsdeveloperblog.app.ws.ui.model.response;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserRestTest {

    @Test
    public void userResponse_basic() {
        UserRest userRest = new UserRest();
        userRest.setUserId("1");
        userRest.setFirstName("Juvenal");
        userRest.setLastName("Juvêncio");
        userRest.setEmail("juvjuv@gmail.com");

        assertEquals("1", userRest.getUserId());
        assertEquals("Juvenal", userRest.getFirstName());
        assertEquals("Juvêncio", userRest.getLastName());
        assertEquals("juvjuv@gmail.com", userRest.getEmail());
    }

    @Test
    public void userResponse_null() {
        UserRest userRest = new UserRest();

        assertNull(userRest.getUserId());
        assertNull(userRest.getFirstName());
        assertNull(userRest.getLastName());
        assertNull(userRest.getEmail());
    }

}