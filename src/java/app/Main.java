package app;
import java.util.Random;
import java.util.Scanner;

/*

Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.

*/

public class Main {

    public static int texting(String text, int n) throws InterruptedException{

        for (int i = 0; i != n; i++) {
            Thread.sleep(300);
            System.out.println(text + "\n");
        }
        return -1;
    }

    public static double degree(double a, int b){
        double p = a;
        for (int i = 1; i != b; i++) {

            a *= p;
        }
        return a;
    }


    public static String conversely(String l){
        return new StringBuilder(l).reverse().toString();
    }


    public static double aDouble(int x){
        return x*x;
    }

    public static int arraySum(int[] x){

        int y = 0;
        for (int i = 0; i < x.length; i++) {

            y += x[i];
        }
        return y;
    }

    public static double cylinder(double h, double r){
        return Math.PI * r * r * h;
    }


    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] ints = new int[5];

        for (int i = 0; i < 5; i++) {
            ints[i] = random.nextInt(0,25);
        }

        System.out.println("write your number and i double it >:3 : ");
        int x = sc.nextInt();
        System.out.println(aDouble(x));


        System.out.println("write height of cylinder : ");
        double h = sc.nextInt();
        System.out.println("write cylinder Radius : ");
        double r = sc.nextInt();

        System.out.println(cylinder(h, r));

        for (int i = 0; i < 5; i++) {
            System.out.printf("[%s]", ints[i]);
        }

        System.out.println("\n" + arraySum(ints));

        System.out.println("What is your name?..");
        String l = sc.next();
        System.out.println(conversely(l));



        System.out.println("write the number you want to add to the degree: ");
        int a = sc.nextInt();
        System.out.println("write down what degree you want the number to go to: ");
        int b = sc.nextInt();
        System.out.println(degree(a,b));



        System.out.println("Can you repeat please, what is your name?..");
        String text = sc.next();
        System.out.println("how many times I have to repeat your name to remember it?.. (write integer): ");
        int n = sc.nextInt();
        texting(text, n);
    }
}


