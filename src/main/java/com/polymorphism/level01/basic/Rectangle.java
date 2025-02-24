package com.polymorphism.level01.basic;

public class Rectangle extends Shape implements Resizable{
    
    private double width; // 너비
    private double height; // 높이

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        width = width * 2;
        height = height * 2;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
