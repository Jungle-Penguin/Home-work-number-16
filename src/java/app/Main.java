package app;



public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 30, "Software Engineer");
        Person person2 = new Person("Jane Smith", 25, "Graphic Designer");
        Person person3 = new Person("Mike Johnson", 40, "Project Manager");


        person1.printInfo();
        System.out.println();
        person2.printInfo();
        System.out.println();
        person3.printInfo();
        System.out.println();

        person1.setProfession("Data Scientist");

        System.out.println("Updated Information:");
        person1.printInfo();
    }
}
