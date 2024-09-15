// Driver class to demonstrate the use of Shape and its subclasses
public class ShapeArray {
    public static void main(String[] args) {
        // Array to store different shapes
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Sphere(5);
        shapeArray[1] = new Cylinder(3, 7);
        shapeArray[2] = new Cone(2, 4);

        // Loop to print details of each shape using the overridden toString methods
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}