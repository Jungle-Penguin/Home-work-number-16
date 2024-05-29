package app.homeWork13;

public class Parallelogram extends Shape{
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getSum() {
        return base * height;
    }

}
