package com.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable {

    private double radius; // 반지름

    public Circle(double radius) {
        this.radius = radius;
    }

    /* Shape 추상 클래스 Overriding */
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    /* Resizable Interface Overriding */
    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }


}
