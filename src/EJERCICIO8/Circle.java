package EJERCICIO8;

public class Circle {
    protected double radius = 1.0;
    protected String color = "Red";

    public Circle() {
        this.radius = radius;
        this.color = color;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
