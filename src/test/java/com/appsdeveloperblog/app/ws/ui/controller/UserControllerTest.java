package com.appsdeveloperblog.app.ws.ui.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getUser() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders
                .get("/users")
                .accept(MediaType.ALL);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("get user was called"))
                .andReturn();
    }

    @Test
    public void createUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .post("/users")
                .accept(MediaType.ALL);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("create user was called"))
                .andReturn();
    }

    @Test
    public void updateUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .put("/users")
                .accept(MediaType.ALL);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("update user was called"))
                .andReturn();
    }

    @Test
    public void deleteUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .delete("/users")
                .accept(MediaType.ALL);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("delete user was called"))
                .andReturn();
    }
}