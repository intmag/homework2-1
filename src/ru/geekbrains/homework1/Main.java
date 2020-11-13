package ru.geekbrains.homework1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Irobot", 15, 0.2);
        Treadmill treadmill = new Treadmill(15);
        Wall wall = new Wall(2.2);
        robot.run(treadmill);
        robot.jump(wall);
        Creature[] competitors = new Creature[12];
        for (int i = 0; i < competitors.length; i++) {
            if (i < 4) {
                competitors[i] = new Cat("Cat" + (i + 1), ((int) (Math.random() * Cat.MAXDISTANCE)), (Math.random() * Cat.MAXHEIGHT));
            } else if (i >= 4 && i < 8) {
                competitors[i] = new Robot("Robot" + (i + 1), ((int) (Math.random() * Robot.MAXDISTANCE)), (Math.random() * Robot.MAXHEIGHT));
            } else if (i >= 8) {
                competitors[i] = new Human("Human" + (i + 1), ((int) (Math.random() * Human.MAXDISTANCE)), (Math.random() * Human.MAXHEIGHT));
            }
        }
        Obstacle[] obstacles = new Obstacle[6];
        for (int i = 0; i < obstacles.length; i++) {
            if (i < 3) {
                obstacles[i] = new Wall(Math.random() * Wall.MAXHEIGHT);
            } else {
                obstacles[i] = new Treadmill((int)(Math.random() * Treadmill.MAXDISTANCE));
            }
        }

        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < competitors.length; j++) {
                if(competitors[i].isDropout()){
                    continue;
                }
                if(obstacles[i] instanceof Wall){
                    competitors[j].jump((Wall)obstacles[i]);
                } else if (obstacles[i] instanceof Treadmill){
                    competitors[j].run((Treadmill)obstacles[i]);
                }
            }
        }
    }
}
