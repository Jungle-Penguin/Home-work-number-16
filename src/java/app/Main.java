package app;

import java.util.Random;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            int[] arr = new int[15];
            int n = arr.length;
            Random random = new Random();

            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(0, 100);
            }
            System.out.println("before sorting:");
            for (int i = 0; i < n; i++) {
                System.out.printf("[%s]", arr[i]);
            }
            System.out.println("\n");


            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }

            System.out.println("after sorting: ");
            for (int i = 0; i < n; i++) {
                System.out.printf("[%s]", arr[i]);
            }

            System.out.println("\n");

            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number you want to retrieve from the array into the search: ");
            int target = scan.nextInt();

            int left = 0;
            int right = n - 1;
            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    System.out.println("number: " + target + " to be in the index: " + mid);
                    break;
                }
                if (arr[mid] < target) {
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }

            }
            if (left > right) {
                System.out.println("Number " + target + " not found in the array.");
            }
        }
}
