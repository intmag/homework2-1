package ru.geekbrains.homework1;

public class Creature {

    protected String name;

    Creature(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void swim() {
        System.out.println(name +" плавает");
    }

}
