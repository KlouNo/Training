package com.Ivanov;

public class Person implements HumanInterface{
    private int age;
    private Personality person;

    public Person(int age, Personality person){
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println("Hello! Can I talk with you?");
    }

    @Override
    public void walk() {
        System.out.println("Hi, let's walk?");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
