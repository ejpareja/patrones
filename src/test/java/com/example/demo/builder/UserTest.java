package com.example.demo.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void userBuilderTest(){
        User user = User.builder()
                .id(1L)
                .nick("elvisJunior")
                .name("Elvis")
                .familyName("Pareja De La Hoz")
                .age(25)
                .phone("3003001360")
                .profession("Tecnologo en adsi")
                .build();

        Assertions.assertNotNull(user);
        Assertions.assertEquals("Elvis", user.getName());
    }

}