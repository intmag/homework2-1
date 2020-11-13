package ru.geekbrains.homework1;

public class Creature {

    private String name;
    private double jumpHeight;
    private int runDistance;
    private boolean dropout = false;

    Creature(String name, int runDistance, double jumpHeight) {
        setName(name);
        setRunDistance(runDistance);
        setJumpHeight(jumpHeight);
    }

    private void setName(String name) {
        this.name = name;
    }

    public boolean isDropout() {
        return dropout;
    }

    private void setDropout(boolean dropout) {
        this.dropout = dropout;
    }

    private void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    private void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    void run(Treadmill treadmill) {
        boolean result = true;
        if (getRunDistance() >= treadmill.getDistance()) {
            System.out.println(name + " успешно пробежал(а) на дорожке длинной " + treadmill.getDistance() + " м.");
            result = false;
        } else {
            System.out.println(name + " не смог(ла) пробежать " + treadmill.getDistance() + " м., запас хода " + getRunDistance());
        }
        setDropout(result);
    }

    void jump(Wall wall) {
        boolean result = true;
        if (getJumpHeight() >= wall.getHeight()) {
            System.out.println(name + " успешно перепрыгнул(а) стену высотой " + wall.getHeight() + " м.");
            result = false;
        } else {
            System.out.println(name + " не смог(ла) перепрыгнуть стену " + wall.getHeight() + " м., максимальная высота прыжка " + getJumpHeight() + " м.");
        }
        setDropout(result);
    }

}
