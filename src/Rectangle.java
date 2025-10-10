public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Ошибка данных");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double calculateArea() {
        return length * width;
    }
}