// Class Cone that extends Shape to provide specific implementations for a cone
public class Cone extends Shape {
    private double radius; // Radius of the cone base
    private double height; // Height of the cone

    // Constructor to initialize the cone with a radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implementation of surface area calculation for a cone
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Implementation of volume calculation for a cone
    @Override
    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    // Overridden toString method to provide a string representation of the cone
    @Override
    public String toString() {
        return "Cone with radius: " + radius + ", height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}