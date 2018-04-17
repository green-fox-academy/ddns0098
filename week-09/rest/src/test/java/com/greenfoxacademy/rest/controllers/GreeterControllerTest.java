package com.greenfoxacademy.rest.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class GreeterControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    public void greet() throws Exception {
        mvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"welcome_message\": \"Oh, hi there Petike, my dear student!\"}"));
    }

    @Test
    public void greetNoName() throws Exception {
        mvc.perform(get("/greeter?title=student"))
                .andExpect(content().json("{\"error\": \"Please provide a name!\"}"));
    }

    @Test
    public void greetNoTitle() throws Exception {
        mvc.perform(get("/greeter?name=Petike"))
                .andExpect(content().json("{\"error\": \"Please provide a title!\"}"));
    }

    @Test
    public void greetNoParam() throws Exception {
        mvc.perform(get("/greeter"))
                .andExpect(content().json("{\"error\": \"Please provide a name!\"}"));
    }
}