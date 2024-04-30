package app;
public class Main {


        public static void main(String[] args){



            int x = 0;


            int y = 0;


            for (int num = 1; num <= 6; num++){
                    y += num;
                    x += num;

                    System.out.println(num + ") Num is " + num + ", sum is: "+ y);

                }

            System.out.println("Sum if numbers is " +  x);
        }
    }
