package ru.geekbrains.homework1;

public class Wall extends Obstacle{
    public static final double MAXHEIGHT = 2.0;
    protected double height;

    Wall(double height){
        setHeight(height);
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
