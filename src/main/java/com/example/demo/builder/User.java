package com.example.demo.builder;

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

    public static Builder builder(){
        return new Builder();
    }

    public static Builder builder(Long id, String nick, String name){
        return new Builder(id, nick, name);
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

    public static class Builder {
        private User user;

        private Builder(){
            this.user = new User();
        }

        private Builder(Long id, String nick, String name){
            super();
            this.user.id = id;
            this.user.nick = nick;
            this.user.name = name;
        }

        public Builder id(Long id){
            this.user.id = id;
            return this;
        }

        public Builder nick(String nick){
            this.user.nick = nick;
            return this;
        }

        public Builder name(String name){
            this.user.name = name;
            return this;
        }

        public Builder familyName(String familyName){
            this.user.familyName = familyName;
            return this;
        }

        public Builder age(int age){
            this.user.age = age;
            return this;
        }

        public Builder phone(String phone){
            this.user.phone = phone;
            return this;
        }

        public Builder profession(String profession){
            this.user.profession = profession;
            return this;
        }

        public User build(){
            return this.user;
        }

    }
}
