package com.java.patterns.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing: " + getClass().getSimpleName());
    }
}
