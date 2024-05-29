package app.homeWork13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius for Circle");
        int R = scanner.nextInt();
        System.out.println("Enter Base for Triangle");
        int A1 = scanner.nextInt();
        System.out.println("Enter height for Triangle");
        int B1 = scanner.nextInt();
        System.out.println("Enter Side for Square");
        int D = scanner.nextInt();
        System.out.println("Enter height for Parallelogram");
        int A2 = scanner.nextInt();
        System.out.println("Enter Base for Parallelogram");
        int B2 = scanner.nextInt();

        Shape[] shapes = {
                new Circle(R),
                new Triangle(A1, B1),
                new Square(D),
                new Parallelogram(A2, B2)
        };

        double totalAreaSum = calculateTotalAreaSum(shapes);
        System.out.println("Total sum of all shapes: " + totalAreaSum);
    }
    // подсмотрел в чуть чуть в гугле
    public static double calculateTotalAreaSum(Shape[] shapes) {
        double totalSum = 0;
        for (Shape shape : shapes) {
            totalSum += shape.getSum();
        }
        return totalSum;
    }
}
