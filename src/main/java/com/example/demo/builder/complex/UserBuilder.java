package com.example.demo.builder.complex;

public interface UserBuilder {

    interface Id {
        Nick id(Long id);
    }

    interface Nick {
        Name nick(String nick);
    }

    interface Name {
        Optionals name(String name);
    }

    interface Optionals {
        Optionals familyName(String familyName);

        Optionals age(int age);

        Optionals phone(String phone);

        Optionals profession(String profession);

        User build();
    }
}
