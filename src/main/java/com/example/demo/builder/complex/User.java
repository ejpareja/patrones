package com.example.demo.builder.complex;

public class User {

    private Long id;
    private String nick;
    private String name;
    private String familyName;
    private int age;
    private String phone;
    private String profession;

    public User() {
    }

    public static UserBuilder.Id builder(){
        return new Builder();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static class Builder implements UserBuilder.Id, UserBuilder.Name, UserBuilder.Nick, UserBuilder.Optionals {
        private User user;

        private Builder(){
            this.user = new User();
        }


        @Override
        public UserBuilder.Nick id(Long id) {
            this.user.id = id;
            return this;
        }

        @Override
        public UserBuilder.Name nick(String nick) {
            this.user.nick = nick;
            return this;
        }

        @Override
        public UserBuilder.Optionals name(String name) {
            this.user.name = name;
            return this;
        }

        @Override
        public UserBuilder.Optionals familyName(String familyName) {
            this.user.familyName = familyName;
            return this;
        }

        @Override
        public UserBuilder.Optionals age(int age) {
            this.user.age = age;
            return this;
        }

        @Override
        public UserBuilder.Optionals phone(String phone) {
            this.user.phone = phone;
            return this;
        }

        @Override
        public UserBuilder.Optionals profession(String profession) {
            this.user.profession = profession;
            return this;
        }

        @Override
        public User build() {
            return this.user;
        }
    }
}
