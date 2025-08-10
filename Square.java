import java.util.Objects;

/**
 * Lớp Square đại diện cho hình vuông, là lớp con của Rectangle.
 * Đảm bảo rằng chiều rộng và chiều dài luôn bằng nhau.
 */
public class Square extends Rectangle {

    /** Khởi tạo hình vuông mặc định với vị trí, màu sắc và trạng thái chưa xác định. */
    public Square() {
        super();
    }

    /**
     * Khởi tạo hình vuông với độ dài cạnh đã biết.
     * Vị trí mặc định là (0,0).
     * @param side độ dài cạnh hình vuông
     */
    public Square(double side) {
        super(new Point(0, 0), side, side);
    }

    /**
     * Khởi tạo hình vuông với cạnh, màu sắc và trạng thái tô màu.
     * Vị trí mặc định là (0,0).
     * @param side độ dài cạnh hình vuông
     * @param color màu sắc của hình vuông
     * @param filled trạng thái hình đã tô màu hay chưa
     */
    public Square(double side, String color, boolean filled) {
        super(new Point(0, 0), side, side, color, filled);
    }

    /**
     * Khởi tạo hình vuông với vị trí, cạnh, màu sắc và trạng thái tô màu.
     * @param topLeft tọa độ điểm trên cùng bên trái
     * @param side độ dài cạnh hình vuông
     * @param color màu sắc của hình vuông
     * @param filled trạng thái hình đã tô màu hay chưa
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Trả về độ dài cạnh của hình vuông.
     * @return độ dài cạnh
     */
    public double getSide() {
        return getWidth(); // width = length trong hình vuông
    }

    /**
     * Cập nhật độ dài cạnh cho cả chiều rộng và chiều dài.
     * @param side độ dài mới của cạnh
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Ghi đè phương thức để đảm bảo cả chiều rộng và chiều dài đều được cập nhật.
     * @param side độ dài mới của cạnh
     */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    /**
     * Ghi đè phương thức để đảm bảo cả chiều dài và chiều rộng đều được cập nhật.
     * @param side độ dài mới của cạnh
     */
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    /**
     * Trả về chuỗi đại diện cho hình vuông, bao gồm thông tin vị trí, cạnh, màu sắc và trạng thái tô màu.
     * @return chuỗi mô tả hình vuông
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + getSide()
               + ",color=" + color + ",filled=" + filled + "]";
    }
}
