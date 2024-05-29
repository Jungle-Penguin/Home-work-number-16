package app.homeWork13;

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getSum() {
        return side * side;
    }
}
