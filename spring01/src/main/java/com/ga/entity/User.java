package com.ga.entity;

public class User {

    private String userName;

    private String age;

    private Integer id;

    public User() {
    }

    public User(String userName, String age, Integer id) {
        this.userName = userName;
        this.age = age;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                '}';
    }
}
