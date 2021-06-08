package ShapesAndArea;

import java.util.Comparator;

public abstract class Shape implements Drawable, Comparable {
    protected String shapeColour;


    public String getShapeColour() {
        return shapeColour;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.calcArea() - ((Shape) o).calcArea());
    }

    Shape(String shapeColour) {
        this.shapeColour = shapeColour;
    }


    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "This is shape, colour is " + shapeColour;


    }

    //public abstract int shapeColour();
}

class Circle extends Shape {
    private double radius;
    final double pi = 3.14;


    Circle(String shapeColour, double radius) {
        super(shapeColour);
        this.radius = radius;
    }

    /*@Override
    public int shapeColour(){
            return this.shapeColour=shapeColour;
    }*/
    @Override
    public double calcArea() {
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return "This is circle, colour is " + shapeColour + ", radius = " + radius;
    }

}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String shapeColour, double width, double height) {
        super(shapeColour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "This is rectangle, colour is " + shapeColour + ", width = " + width + ", height = " + height;
    }

}

class Triangle extends Shape {
    private double a, b, c;
    private double s;

    Triangle(String shapeColour, double a, double b, double c) {
        super(shapeColour);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calcArea() {
        s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "This is triangle, colour is " + shapeColour + ", a = " + a + ", b = " + b + ", c = " + c;
    }
}

interface Drawable {
    void draw();
}


class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Shape) o2).shapeColour.compareTo(((Shape) o1).shapeColour);

    }
}
