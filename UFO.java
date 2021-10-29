package com.Ivanov;

public class UFO implements HumanInterface {
    private int age;
    Personality person;

    public UFO(int age,Personality person) {
        this.age = age;
        this.person = person;

    }

    @Override
    public void talk() {
        System.out.println("Hello! I'm alien!");

    }

    @Override
    public void walk() {
        System.out.println("U gonna die!");

    }

    @Override
    public int getAge() {
        return this.age;
    }
}
