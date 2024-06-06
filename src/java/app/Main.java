package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        app.DayAdvisor advisor = new app.DayAdvisor();


        Scanner scanner = new Scanner(System.in);
        System.out.println("What day you have today, or what day you want advice on? >>" + "\n");
        System.out.println("1) Monday" + "\n");
        System.out.println("2) Tuesday" + "\n");
        System.out.println("3) Wednesday" + "\n");
        System.out.println("4) Thursday" + "\n");
        System.out.println("5) Friday" + "\n");
        System.out.println("6) Saturday" + "\n");
        System.out.println("7) Sunday" + "\n");
        System.out.println("Write the number above that is over your day: ");

        int day = -1;

        while (true) {
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if (day >= 0 && day <= 7) {
                    break;
                } else {
                    System.out.println("number of day must be in the range from 1 to 7:");
                }
            } else {
                System.out.println("error input: " + scanner.next() + ". Enter Day:");
            }}
        switch (day) {
            case (1): advisor.advise(Day.MONDAY); break;
            case (2): advisor.advise(Day.TUESDAY); break;
            case (3): advisor.advise(Day.WEDNESDAY); break;
            case (4): advisor.advise(Day.THURSDAY); break;
            case (5): advisor.advise(Day.FRIDAY); break;
            case (6): advisor.advise(Day.SATURDAY); break;
            case (7): advisor.advise(Day.SUNDAY); break;
            default: System.out.println("i dont find it in base."); break;
        }
    }
}
