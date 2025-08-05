import java.util.ArrayList;

/**
 * Lớp Layer quản lý danh sách các đối tượng Shape và xử lý thao tác trên chúng.
 */
public class Layer {
    private ArrayList<Shape> shapes;

    /**
     * Khởi tạo layer rỗng.
     */
    public Layer() {
        shapes = new ArrayList<>();
    }

    /**
     * Thêm hình vào layer.
     * @param shape hình cần thêm
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Xóa tất cả hình tròn khỏi layer.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Loại bỏ các hình trùng lặp khỏi layer.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }

    /**
     * Trả về thông tin toàn bộ các hình trong layer.
     * @return chuỗi mô tả
     */
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape.toString()).append("\n");
        }
        return sb.toString();
    }
}
