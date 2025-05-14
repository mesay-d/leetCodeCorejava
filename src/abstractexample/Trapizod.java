package abstractexample;

public class Trapizod extends Shape{
    private double base1;
    private double base2;
    private double height;

    public Trapizod(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base1+base2)/2*height;
    }
}
