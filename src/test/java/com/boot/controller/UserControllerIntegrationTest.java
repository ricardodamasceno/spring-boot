package com.boot.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestPropertySource(locations = "classpath:application-staging.properties")
public class UserControllerIntegrationTest {

    @Test
    public void getUsersTest() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/v1/user/", String.class);
        Assert.assertNotEquals(response.getBody().length(),0);
    }

    @Test
    public void getUserById() throws JSONException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/v1/user/1", String.class);
        JSONObject user = new JSONObject(response.getBody());
        Assert.assertEquals(user.getLong("id"), 1l);
    }

}
