package app;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Ivan Ivanovsky", "vendor", "ivan@example.com", "+380121231231", 30);
        System.out.println("co worker: " + employee.getFullName() + ", position: " + employee.getPosition());

        Car car = new Car();
        car.start();
    }
}
