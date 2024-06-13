package com.example;

import com.hillel.Calculator;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number one : ");
        double No = scanner.nextInt();
        System.out.println("enter number one : ");
        double Nt = scanner.nextInt();

        System.out.println("what you want to do with this numbers? - \n");
        System.out.println("1) add \n");
        System.out.println("2) subtract  \n");
        System.out.println("3) multiply  \n");
        System.out.println("4) divide  \n");
        int n = scanner.nextInt();
        if (n > 4){
            System.out.println("Error!! number of operation is wrong");
        }else{
        switch (n) {
            case  1: System.out.println(calculator.add(No, Nt));      break;
            case  2: System.out.println(calculator.subtract(No, Nt)); break;
            case  3: System.out.println(calculator.multiply(No, Nt)); break;
            case  4: System.out.println(calculator.divide(No, Nt));   break;
        }
        }
    }
}
