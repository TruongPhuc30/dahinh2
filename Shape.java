/**
 * Lớp trừu tượng Shape đại diện cho các hình học cơ bản.
 * Là lớp cha của các hình cụ thể như Circle, Rectangle, Square.
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Khởi tạo một hình với màu sắc và trạng thái tô màu mặc định.
     */
    public Shape() {
        color = "green";
        filled = true;
    }

    /**
     * Khởi tạo một hình với màu sắc và trạng thái tô màu cụ thể.
     * @param color màu sắc của hình
     * @param filled trạng thái hình đã tô màu hay chưa
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Lấy màu sắc của hình.
     * @return màu sắc
     */
    public String getColor() {
        return color;
    }

    /**
     * Đặt màu sắc mới cho hình.
     * @param color màu mới
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Kiểm tra xem hình có được tô màu không.
     * @return true nếu đã tô màu, false nếu chưa
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Đặt trạng thái tô màu cho hình.
     * @param filled trạng thái tô màu
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Tính diện tích của hình – sẽ được hiện thực bởi lớp con.
     * @return diện tích
     */
    public abstract double getArea();

    /**
     * Tính chu vi của hình – sẽ được hiện thực bởi lớp con.
     * @return chu vi
     */
    public abstract double getPerimeter();

    /**
     * Trả về chuỗi mô tả hình, bao gồm màu sắc và trạng thái tô màu.
     * @return chuỗi mô tả
     */
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
