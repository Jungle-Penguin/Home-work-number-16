package app.homeWork13;

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getSum() {
        return 0.5 * base * height;
    }
}
