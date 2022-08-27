package com.example.demo.builder.complex;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void userBuilderComplexTest(){
        User user = User.builder()
                .id(1L)
                .nick("Elviscocho")
                .name("Elvis Junior")
                .age(25)
                .build();

        Assertions.assertEquals("Elviscocho", user.getNick());
        Assertions.assertEquals("Elvis Junior", user.getName());
        Assertions.assertEquals(25, user.getAge());
        Assertions.assertEquals(1L, user.getId());
        Assertions.assertNull( user.getProfession());

    }

}