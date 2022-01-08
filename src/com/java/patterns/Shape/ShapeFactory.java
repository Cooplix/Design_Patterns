package com.java.patterns.Shape;

public class ShapeFactory {
    public final static String CIRCLE = "CIRCLE";
    public final static String RECTANGLE = "RECTANGLE";
    public final static String SQUARE = "SQUARE";
    public final static String UNSUPPORTED = "UNSUPPORTED SHAPE";

    public Shape getShape(String shapeType) {
        return switch (shapeType) {
           case CIRCLE -> new Circle();
           case RECTANGLE ->  new Rectangle();
           case SQUARE -> new Square();
           default -> () -> System.out.println(UNSUPPORTED);
       };
    }
}
