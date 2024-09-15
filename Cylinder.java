// Class Cylinder that extends Shape to provide specific implementations for a cylinder
public class Cylinder extends Shape {
    private double radius; // Radius of the cylinder base
    private double height; // Height of the cylinder

    // Constructor to initialize the cylinder with a radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implementation of surface area calculation for a cylinder
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Implementation of volume calculation for a cylinder
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Overridden toString method to provide a string representation of the cylinder
    @Override
    public String toString() {
        return "Cylinder with radius: " + radius + ", height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}