package ru.geekbrains.homework1;

public class Robot extends Creature{
    public static final double MAXHEIGHT = 1.2;
    public static final int MAXDISTANCE = 1500;
    Robot(String name, int runDistance, double jumpHeight) {
        super(name, runDistance, jumpHeight);
    }
}
