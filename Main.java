package com.Ivanov;

public class Main {
    public static void main(String[] args) {

        Person bob = new Person(23, Personality.MALE);
        System.out.println(bob.getAge());
        bob.talk();
        Person ann = new Person(21, Personality.FEMALE);
        System.out.println(ann.getAge());
        ann.talk();

        UFO sqed = new UFO(49, Personality.ALIEN);
        System.out.println(sqed.getAge());
        sqed.talk();
    }
}


