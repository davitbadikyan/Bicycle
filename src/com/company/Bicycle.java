package com.company;

public class Bicycle {
    private String name;
    private String type;
    private int size;
    private int speed = 0;
    private int wheelsCount;
    private String color;
    private boolean hasBottlePlace;
    private boolean hasBreak;
    private String breakType;
    private float price;
    private static final int MAX_SPEED = 70;
    private int angleComparedToEntryPoint = 0;


    public Bicycle(String name, String type, String color, int size) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.size = size;
        System.out.println("Created new bike with name:" + name + " and type: " + type);
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void setHasBreak(boolean hasBreak) {
        this.hasBreak = hasBreak;
    }

    public void setBreakType(String breakType) {
        this.breakType = breakType;
    }

    public Bicycle() {
        name = "Default Name";
        type = "Dirt";
        size = 27;
        wheelsCount = 2;
        color = "Pink";
        hasBreak = true;
        breakType = "Disc";
        System.out.println("Created new bike with name:" + name + " and type: " + type);
    }

    public void start() {
        System.out.println("Starting with speed: " + speed);
    }

    public void stop() {
        while (speed > 0) {
            pressBreak();
        }
        System.out.println("Stopped");
    }

    public void pressBreak () {
        System.out.println("Break is pressed on speed: " + speed);
        if (hasBreak) {
            if(speed > 40) {
                speed -= 5;
            }
            else if (speed > 30) {
                speed -= 4;
            }
            else if (speed > 20) {
                speed -= 3;
            }
            else if (speed > 10) {
                speed -= 2;
            }
            else {
                speed --;
            }
        }
        System.out.println("Speed breaked to: " + speed);
    }

    public void accelerate () {
        System.out.println("Accelerate on speed: " + speed);
        if (speed < MAX_SPEED) {
            if(speed > 40) {
                speed += 1;
            }
            else if (speed > 30) {
                speed += 2;
            }
            else if (speed > 20) {
                speed += 3;
            }
            else if (speed > 10) {
                speed += 4;
            }
            else {
                speed += 5;
            }
        }
        System.out.println("Accelerate to: " + speed);
    }

    public void turnRight () {
        System.out.println("Angle before turning right is: " + angleComparedToEntryPoint);
        if(speed > 40) {
            angleComparedToEntryPoint += 10;
        }
        else if (speed > 30) {
            angleComparedToEntryPoint += 20;
        }
        else if (speed > 20) {
            angleComparedToEntryPoint += 30;
        }
        else if (speed > 10) {
            angleComparedToEntryPoint += 40;
        }
        else {
            angleComparedToEntryPoint +=50;
        }
        if(angleComparedToEntryPoint >= 360) {
            angleComparedToEntryPoint = angleComparedToEntryPoint -360;
        }
        System.out.println("Current angle is : " + angleComparedToEntryPoint);
    }

    public void turnLeft () {
        System.out.println("Angle before turning left is: " + angleComparedToEntryPoint);
        if(speed > 40) {
            angleComparedToEntryPoint -= 10;
        }
        else if (speed > 30) {
            angleComparedToEntryPoint -= 20;
        }
        else if (speed > 20) {
            angleComparedToEntryPoint -= 30;
        }
        else if (speed > 10) {
            angleComparedToEntryPoint -= 40;
        }
        else {
            angleComparedToEntryPoint -=50;
        }
        if(angleComparedToEntryPoint < 0) {
            angleComparedToEntryPoint = 360 + angleComparedToEntryPoint;
        }
        System.out.println("Current angle is : " + angleComparedToEntryPoint);
    }
}
