package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle, "
                + "area: " + area() + " sq.units, "
                + "radius: " + this.radius + " units, "
                + "color: " + this.color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}