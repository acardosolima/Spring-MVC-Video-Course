package com.appsdeveloperblog.app.ws.service.impl;

import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class UserServiceImplTest {

    @Test
    public void createUser_null() {
        UserService userService = new UserServiceImpl();
        UserDto userDto = new UserDto();

        assertNull(userService.createUser(userDto));
    }

}