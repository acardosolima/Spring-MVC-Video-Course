package com.appsdeveloperblog.app.ws.shared.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserDtoTest {

    @Test
    public void userDto_basic() {
        UserDto userDto = new UserDto();

        userDto.setId(100);
        userDto.setUserId("1");
        userDto.setFirstName("Juvenal");
        userDto.setLastName("Juvêncio");
        userDto.setEmail("juvjuv@gmail.com");
        userDto.setPassword("teste123");
        userDto.setEncryptedPassword("e7d80ffeefa212b7c5c55700e4f7193e");
        userDto.setEmailVerificationToken("asd123");
        userDto.setEmailVerificationStatus(true);

        assertEquals(100, userDto.getId());
        assertEquals("1", userDto.getUserId());
        assertEquals("Juvenal", userDto.getFirstName());
        assertEquals("Juvêncio", userDto.getLastName());
        assertEquals("juvjuv@gmail.com", userDto.getEmail());
        assertEquals("teste123", userDto.getPassword());
        assertEquals("e7d80ffeefa212b7c5c55700e4f7193e", userDto.getEncryptedPassword());
        assertEquals("asd123", userDto.getEmailVerificationToken());
        assertTrue(userDto.getEmailVerificationStatus());
    }

}