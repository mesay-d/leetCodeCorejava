package abstractexample;

public class Circle extends Shape {
    private int radieus;

    public Circle(int radieus) {
        this.radieus = radieus;
    }

    @Override
    public double calculateArea() {
        return radieus*radieus*Math.PI;
    }
}
