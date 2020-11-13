package ru.geekbrains.homework1;

public class Treadmill extends Obstacle{
    public static final int MAXDISTANCE = 50000;
    protected int distance;

    Treadmill(int distance){
        setDistance(distance);
    }

    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        this.distance = distance;
    }
}
