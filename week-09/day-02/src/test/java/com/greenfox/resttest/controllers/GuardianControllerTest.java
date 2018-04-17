package com.greenfox.resttest.controllers;

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
public class GuardianControllerTest {

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
    public void groot() throws Exception {
        mvc.perform(get("/groot?message=somemessage"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'received' : 'somemessage', 'translated' : 'I am Groot!'}"));
    }

    @Test
    public void grootNoParam() throws Exception {
        mvc.perform(get("/groot"))
                .andExpect(status().isNoContent())
                .andExpect(content().json("{'error' : 'I am Groot!'}"));
    }

    @Test
    public void yondu() throws Exception {
        mvc.perform(get("/yondu?distance=100.0&time=10.0"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'distance' : 100.0, 'time' : 10.0, 'speed' : 10.0}"));
    }

    @Test
    public void yonduNoTime() throws Exception {
        mvc.perform(get("/yondu?distance=100.0"))
                .andExpect(status().isNoContent())
                .andExpect(content().json("{'error' : 'Please provide a time!'}"));
    }

    @Test
    public void yonduNoParam() throws Exception {
        mvc.perform(get("/yondu"))
                .andExpect(status().isNoContent())
                .andExpect(content().json("{'error' : 'Please provide a distance!'}"));
    }
}