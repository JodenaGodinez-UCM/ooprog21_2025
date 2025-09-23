public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public static void main(String[] args) {
        DebugCircle c = new DebugCircle(5); 
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Diameter: " + c.getDiameter());
        System.out.println("Area: " + c.getArea());
    }
}
