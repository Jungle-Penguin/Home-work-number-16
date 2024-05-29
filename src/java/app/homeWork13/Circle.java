package app.homeWork13;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getSum() {
        return Math.PI * radius * radius;
    }
}