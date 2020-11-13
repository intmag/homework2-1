package ru.geekbrains.homework1;

public class Human extends Creature{
    public static final double MAXHEIGHT = 2.5;
    public static final int MAXDISTANCE = 45000;
    Human(String name, int runDistance, double jumpHeight) {
        super(name, runDistance, jumpHeight);
    }
}
