package com.polymorphism.level01.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        /*int length = shapes.length;
        if(!(shapes[length - 1] == null)) {
            Shape[] newShapes;
            newShapes = Arrays.copyOf(shapes, length * 2);
            shapes = newShapes;
        }
        int nullIndex = Arrays.asList(shapes).indexOf(null);
        shapes[nullIndex] = shape;*/
        if(index >= shapes.length) {
            shapes = Arrays.copyOf(shapes, shapes.length * 2);
        }
        shapes[index++] = shape;
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for(int i = 0; i < index; i++) {
            if(shapes[i].equals(shape)) {
                for(int j = i; j < index -1; j++){
                    shapes[j] = shapes[j + 1];
                }
                shapes[index-1] = null;
                index--;
                break;
            }
        }

        /* 다른 방법 */
        ArrayList<Shape> shapesList = new ArrayList<>(Arrays.asList(shapes));
        shapesList.remove(shape);
        shapes = shapesList.toArray(new Shape[shapesList.size()]);
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        /* Shape: Circle
           Area: 78.53981633974483
           Perimeter: 31.41592653589793 */
        for(Shape s : shapes) {
            if(s == null) break;
            System.out.println("Shape: " + s.getClass().getSimpleName());
            System.out.println("Area: " + s.calculateArea());
            System.out.println("Perimeter: " + s.calculatePerimeter());
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sumArea = 0.0;
        for(Shape s : shapes) {
            if(s == null) break;
            sumArea += s.calculateArea();
        }
        return sumArea;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sumPm = 0.0;
        for(Shape s : shapes) {
            if(s == null) break;
            sumPm += s.calculatePerimeter();
        }
        return sumPm;
    }
}
