import java.util.Objects;

/**
 * Lớp Point đại diện cho một điểm trong không gian 2D.
 */
public class Point {
    private double pointX;
    private double pointY;

    /**
     * Khởi tạo điểm với tọa độ x và y cụ thể.
     * @param pointX hoành độ
     * @param pointY tung độ
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Lấy hoành độ của điểm.
     * @return pointX
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * Cập nhật hoành độ của điểm.
     * @param pointX giá trị mới
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Lấy tung độ của điểm.
     * @return pointY
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Cập nhật tung độ của điểm.
     * @param pointY giá trị mới
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Tính khoảng cách giữa điểm hiện tại và điểm mới.
     * @param newPoint điểm cần tính khoảng cách tới
     * @return khoảng cách Euclid
     */
    public double distance(Point newPoint) {
        double dx = this.pointX - newPoint.pointX;
        double dy = this.pointY - newPoint.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * So sánh hai điểm xem có tọa độ bằng nhau không.
     * @param o đối tượng cần so sánh
     * @return true nếu giống nhau, ngược lại false
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        Point other = (Point) o;
        return pointX == other.pointX && pointY == other.pointY;
    }

    /**
     * Tính mã băm cho đối tượng Point.
     * @return mã băm
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * Trả về chuỗi mô tả điểm dưới dạng (x, y).
     * @return chuỗi tọa độ
     */
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
