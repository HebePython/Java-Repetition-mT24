public class Rectangle implements Measurable {
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }


    public int getArea() {
        return height * length;
    }

    public int getPerimeter() {
        return (length + height) * 2;

    }
    
}
