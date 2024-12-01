package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.isTachometerEqualToZero());
        c1.start();
        c1.start();
        System.out.println(c1.isTachometerGreaterThanZero());
        c1.accelerate();
        c1.stop();
        c1.accelerate();
        c1.speedometer = Car.MAX_SPEED;
        c1.accelerate();
        c1.accelerate();
        System.out.println(c1.speedometer);
        c1.brake();
        System.out.println(c1.speedometer);
        c1.speedometer = 0;
        System.out.println(c1.speedometer);
        c1.brake();
        System.out.println(c1.wheelsAngle);
        c1.turnAngleOfWheels(50);
        System.out.println(c1.wheelsAngle);
        System.out.println("\n");
        c1.speedometer = 25;
        System.out.println(c1.speedometer);
        c1.gear = "3";
        System.out.println(c1.gear);
        System.out.println(c1.tachometer);
        c1.setReverse(true);
        System.out.println(c1.speedometer);
        System.out.println(c1.gear);
        System.out.println(c1.tachometer);
    }
}