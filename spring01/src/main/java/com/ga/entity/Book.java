package com.ga.entity;

public class Book {

    private String name;
    private String code;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
