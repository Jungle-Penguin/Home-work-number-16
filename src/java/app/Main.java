package app;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[][] arr = {{1, 15, 14, 4}, {12, 6, 7, 9}, {8, 10, 11, 5}, {13, 3, 2, 16}}; Проверка на магический кубиk
        int[][] arr = new int[4][4];

        int zeZero = 0;
        int onZero = 0;
        int twZero = 0;
        int thZero = 0;
        int zeroZe = 0;
        int zeroOn = 0;
        int zeroTw = 0;
        int zeroTh = 0;
        int diagonalR = 0;
        int diagonalL = 0;
        int pairSum = 0;
        int nonePairSum = 0;
        double multiplyPair = 1;
        double multiplyNonePair = 1;
        
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = random.nextInt(1, 51);

            }
        }

        for (int[] anInt : arr) {
            for (int i : anInt) {
                System.out.printf("[%s] ", i);
            }
            System.out.println();
        }




        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
//                System.out.println(i + "." + j);
                if (i == j) {
                    diagonalL += arr[i][j];
                }

                switch (j) {
                    case 0 -> zeroZe += arr[i][j];
                    case 1 -> zeroOn += arr[i][j];
                    case 2 -> zeroTw += arr[i][j];
                    case 3 -> zeroTh += arr[i][j];
                }
                switch (i) {
                    case 0 -> zeZero += arr[i][j];
                    case 1 -> onZero += arr[i][j];
                    case 2 -> twZero += arr[i][j];
                    case 3 -> thZero += arr[i][j];
                }
            }

//            System.out.println(zeroZe + " " + zeroOn + " " + zeroTw + " " + zeroTh); System.out.println(diagonalL);
        }


        int y = 3;
        int x = 0;
        while (y != -1) {
            diagonalR += arr[y][x];
            y--;
            x++;
        }



        for (int i = 0; i < 4; i += 2) {
            for (int j = 0; j < 4; j++) {
//                System.out.printf("%s + ", arr[i][j]); output code for debug + (pair)
                pairSum += arr[i][j];
            }

        }

        for (int i = 0; i < 4; i += 2) {

            for (int j = 0; j < 4; j++) {
//                System.out.printf("%s * ", arr[i][j]); output code for debug * (pair)
                multiplyPair *= arr[i][j];
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i += 2) {

            for (int j = 0; j < 4; j++) {
//                System.out.printf("%s * ", arr[i][j]); output code for debug * (not pair)
                multiplyNonePair *= arr[i][j];
            }
            System.out.println();
        }

        for (int i = 1; i < 4; i += 2) {
            for (int j = 0; j < 4; j++) {
//                System.out.printf("%s + ", arr[i][j]); output code for debug + (not pair)
                nonePairSum += arr[i][j];
            }
        }

        int zeOne = zeZero + onZero + twZero + thZero + zeroZe + zeroOn + zeroTw + zeroTh;                       // для проверки на магический кубик
        int dio = diagonalL + diagonalR + diagonalL + diagonalR + diagonalL + diagonalR + diagonalL + diagonalR; // для проверки на магический кубик

        System.out.println("sum of paired elements on matrix(4x4) and with index 0 2: " + pairSum);
        System.out.println("Sum of not paired elements on matrix(4x4) and with index 1 3: " + nonePairSum);
        System.out.println("multiply of paired elements on matrix(4x4) and with index 0 2: " + multiplyPair);
        System.out.println("multiply of not paired elements on matrix(4x4) and with index 1 3: " + multiplyNonePair);

        if (zeOne == dio) {                              // проверка на магический кубик
            System.out.println("this is MAGIC CUBE");    // проверка на магический кубик
        }else{                                           // проверка на магический кубик
            System.out.println("this is NOT MAGIC CUBE");// проверка на магический кубик
        }

    }
}


