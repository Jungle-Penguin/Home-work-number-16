package app;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("write your slary: ");
        Scanner scanner = new Scanner(System.in);
        double userS = scanner.nextInt();

        if(userS < 0){
            System.out.println("find a job man...");
        } else if (userS <= 10000) {
            System.out.println("Greetings your taxes is : " + userS / 100 * 2.5);
        } else if (userS <= 25000){
            System.out.println("Greetings your taxes is : " + userS / 100 * 4.3);
        } else{
            System.out.println("Greetings your taxes is : " + userS / 100 * 6.7);
        }

    }
}