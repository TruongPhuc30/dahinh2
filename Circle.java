import java.util.Objects;

/**
 * Lớp Circle đại diện cho hình tròn, kế thừa từ Shape.
 */
public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Khởi tạo hình tròn mặc định với bán kính 1 và tâm tại (0,0).
     */
    public Circle() {
        super();
        this.radius = 1.0;
        this.center = new Point(0, 0);
    }

    /**
     * Khởi tạo hình tròn với bán kính cụ thể.
     * @param radius bán kính
     */
    public Circle(double radius) {
        super();
        this.center = new Point(0, 0);
        this.radius = radius;
    }

     /**
      * Khởi tạo hình tròn với bán, mau kính cụ thể.
      * @param color mau
      * @param radius bán kính
      */
     public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.center = new Point(0, 0);
        this.radius = radius;
     }
    
    /**
     * Khởi tạo hình tròn đầy đủ thông tin.
     * @param center tọa độ tâm
     * @param radius bán kính
     * @param color màu sắc
     * @param filled trạng thái tô màu
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * Lấy bán kính của hình tròn.
     * @return bán kính
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Đặt bán kính mới cho hình tròn.
     * @param radius bán kính mới
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Trả về tọa độ tâm của hình tròn.
     *
     * @return đối tượng {@code Point} đại diện cho tâm hình tròn
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Thiết lập tọa độ tâm mới cho hình tròn.
     *
     * @param center đối tượng {@code Point} mới làm tâm hình tròn
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Tính diện tích hình tròn.
     * @return diện tích
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Tính chu vi hình tròn.
     * @return chu vi
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Trả về chuỗi mô tả hình tròn, bao gồm tâm, bán kính và thông tin cơ bản.
     * @return chuỗi mô tả
     */
    @Override
    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius 
            +",color=" + color + ",filled=" + filled + "]";
    }
    
    @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Circle other = (Circle) obj;
   return Double.compare(radius, other.radius) == 0 
       && Objects.equals(center, other.center) 
       && Objects.equals(color, other.color) 
       && filled == other.filled;
}
}
