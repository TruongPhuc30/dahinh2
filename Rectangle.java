import java.util.Objects;

/**
 * Lớp Rectangle đại diện cho hình chữ nhật, kế thừa từ Shape.
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Khởi tạo hình chữ nhật mặc định với width, length là 1.
     */
    public Rectangle() {
        super();
        this.topLeft = new Point(0, 0);
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Khởi tạo hình chữ nhật với kích thước cụ thể.
     * @param width chiều rộng
     * @param length chiều dài
     */
    public Rectangle(double width, double length) {
        super();
        this.topLeft =  new Point(0, 0);
        this.width = width;
        this.length = length;
    }

    /**
     * Khởi tạo hình chữ nhật với vị trí, kích thước cụ thể.
     * @param topLeft tọa độ góc trái trên
     * @param width chiều rộng
     * @param length chiều dài
     */
    public Rectangle(Point topLeft, double width, double length) {
        super();
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Khởi tạo hình chữ nhật đầy đủ thông tin.
     * @param width chiều rộng
     * @param length chiều dài
     * @param color màu sắc
     * @param filled trạng thái tô màu
     */
     public Rectangle( double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft =  new Point(0, 0);
        this.width = width;
        this.length = length;
    }

    /**
     * Khởi tạo hình chữ nhật đầy đủ thông tin.
     * @param topLeft tọa độ góc trái trên
     * @param width chiều rộng
     * @param length chiều dài
     * @param color màu sắc
     * @param filled trạng thái tô màu
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Lấy chiều rộng của hình chữ nhật.
     * @return chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * Đặt chiều rộng mới cho hình chữ nhật.
     * @param width chiều rộng mới
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Lấy chiều dài của hình chữ nhật.
     * @return chiều dài
     */
    public double getLength() {
        return length;
    }

    /**
     * Đặt chiều dài mới cho hình chữ nhật.
     * @param length chiều dài mới
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Trả về tọa độ góc trên bên trái của hình chữ nhật.
     *
     * @return đối tượng {@code Point} đại diện cho góc trên bên trái
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * Thiết lập tọa độ góc trên bên trái mới cho hình chữ nhật.
     *
     * @param topLeft đối tượng {@code Point} mới làm góc trên bên trái
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Tính diện tích hình chữ nhật.
     * @return diện tích
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Tính chu vi hình chữ nhật.
     * @return chu vi
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Trả về chuỗi mô tả hình chữ nhật, bao gồm vị trí, kích thước và thông tin cơ bản.
     * @return chuỗi mô tả
     */
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ",width=" + width + ",length=" + length +
               ",color=" + color + ",filled=" + filled + "]";
    }

     /**
     * So sánh hai đối tượng Rectangle có bằng nhau không.
     *
     * @param o đối tượng cần so sánh
     * @return true nếu bằng nhau, false nếu không
     */
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) o;
        return Double.compare(width, other.width) == 0 &&
                Double.compare(length, other.length) == 0 &&
                Objects.equals(color, other.color) &&
                filled == other.filled;
    }

     /**
     * Tạo mã băm cho đối tượng Rectangle.
     *
     * @return mã băm
     */
    @Override
    public int hashCode() {
        return Objects.hash(width, length, color, filled);
    }
}
