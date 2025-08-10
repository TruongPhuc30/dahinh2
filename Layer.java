import java.util.ArrayList;
import java.util.List;

/**
 * Lớp Layer quản lý danh sách các đối tượng Shape và xử lý thao tác trên chúng.
 */
public class Layer {
    private List<Shape> shapes;

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
        for (int i = shapes.size() - 1; i >= 0; i--) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
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
         StringBuilder sb = new StringBuilder("Layer of crazy shapes:\n");
         for (Shape shape : shapes) {
             sb.append(shape.toString()).append("\n");
         }
         return sb.toString();
     }
 }
