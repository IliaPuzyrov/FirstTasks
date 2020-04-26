package oopWithClasses.man;

public class Man {
    private int age;
    private String name;
    private String sureName;


    public Man(int age, String name, String sureName) {
        this.age = age;
        this.name = name;
        this.sureName = sureName;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

}
