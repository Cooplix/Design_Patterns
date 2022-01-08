package com.java.patterns.Shape;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape unsupported = shapeFactory.getShape("");
        unsupported.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
