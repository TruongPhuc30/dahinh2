public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {
        this.center = new Point(0, 0);
        this.radius = 1.0;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return center.equals(other.center) && radius == other.radius;
    }

    @Override
    public int hashCode() {
        return center.hashCode() + Double.hashCode(radius);
    }
}
