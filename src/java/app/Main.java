package app;

import java.util.Random;

public class Main {


        public static void main(String[] args){
            // Создание массива и указывание что в нём будет 20 обьектов(чисел)
            int[] numbers = new int[20];
            // Создание Рандома
            Random random = new Random();
            // Цикл который рандомизирует числа в Массиве от - 100 до 100
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(-100,100);
            }

            int sumOfMinus = 0; // переменная для суммы минусовых чисел

            int even = 0;       // переменная для чётных чисел
            int odd = 0;        // переменная для не чётных чисел

            int min = 0;        // переменная для минимальных
            int max = 0;        // переменная для максимальных чисел

            // а вот переменная для среднего арефметического числа:

            boolean arephMein = false;
            double sum = 0; // Переменная Суммы чисел массива
            int x = 0;      // Создаю переменную которая будет работать как счётчик (не для арифметического числа, а для булевого значения arephMein)
            double avr = 0; // Среднее арифметическое число
            int y = 0;      // Создаю переменную которая будет работать как счётчик вот она уже будет работать для вычисления итогового Среднего Арифметического числа
            // Основной Цикл
            for (int i : numbers) {
                if (i % 2 == 0) {even++;}
                else            {odd++;}
                if (i > max)    {max = i;}
                if (i < min)    {min = i;}
                if (i<0)        {sumOfMinus += i;}
            }

        // Цикл с Арифметическим числом (его начальными вычислениями)
            for (int i : numbers) {
                x++;


                if (i < 0) {
                    arephMein = true;
                } else if (x == 20 && !arephMein) {
                    System.out.println("no minus numbers found. The sum of " +
                            "the minus numbers will be zero, and i cant find arithmetic mean \n");
                }
                if (arephMein){
                    sum += i;
                    y++;
                }
            }
        // Основные исчисления Среднего Арифметического числа
            if (arephMein) {
                avr = sum / y;
            }
            System.out.println("sum of minus randomly generated numbers in the array: " + sumOfMinus + "\n" +
                    "Even numbers: " + even + "\n" + "Odd numbers: " + odd + "\n" + "Smallest number: " + min + "\n" + "largest number: "
                    + max + "\n" + "sum of the mean arithmetic number in this array: " + avr + "\n");
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.printf("[%s]", numbers[i]);
//            } КОД ВЫВОДА МАССИВА УРАА Я ДОДЕЛАЛ



        }
    }
