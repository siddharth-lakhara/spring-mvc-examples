package com.lakhara.SpringMvcExample;

public class FormModel {
    private String name;
    private int age;

    public FormModel() {
        this.name = "";
        this.age = 0;
    }

    public FormModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
