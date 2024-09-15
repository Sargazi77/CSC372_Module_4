// Class Sphere that extends Shape to provide specific implementations for a sphere
public class Sphere extends Shape {
    private double radius; // Radius of the sphere

    // Constructor to initialize the sphere with a radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implementation of surface area calculation for a sphere
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Implementation of volume calculation for a sphere
    @Override
    public double volume() {
        return (4.0/3) * Math.PI * radius * radius * radius;
    }

    // Overridden toString method to provide a string representation of the sphere
    @Override
    public String toString() {
        return "Sphere with radius: " + radius + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}