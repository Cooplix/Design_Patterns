package com.java.patterns.Shape;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing: " + getClass().getSimpleName());
    }
}
