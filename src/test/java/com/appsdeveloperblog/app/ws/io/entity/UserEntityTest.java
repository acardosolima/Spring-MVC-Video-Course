package com.appsdeveloperblog.app.ws.io.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserEntityTest {

    @Test
    public void userEntity_basic() {
        UserEntity userEntity = new UserEntity();

        userEntity.setId(100);
        userEntity.setUserId("1");
        userEntity.setFirstName("Juvenal");
        userEntity.setLastName("Juvêncio");
        userEntity.setEmail("juvjuv@gmail.com");
        userEntity.setEncryptedPassword("e7d80ffeefa212b7c5c55700e4f7193e");
        userEntity.setEmailVerificationToken("asd123");
        userEntity.setEmailVerificationStatus(true);

        assertEquals(100, userEntity.getId());
        assertEquals("1", userEntity.getUserId());
        assertEquals("Juvenal", userEntity.getFirstName());
        assertEquals("Juvêncio", userEntity.getLastName());
        assertEquals("juvjuv@gmail.com", userEntity.getEmail());
        assertEquals("e7d80ffeefa212b7c5c55700e4f7193e", userEntity.getEncryptedPassword());
        assertEquals("asd123", userEntity.getEmailVerificationToken());
        assertTrue(userEntity.getEmailVerificationStatus());
    }

}