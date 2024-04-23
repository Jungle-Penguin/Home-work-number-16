package app;

public class Main {
    public static void main(String[] args) {
        int No1Days = 5;
        float sBD1 = 2430.68f;
        int No2Days = 7;
        float sBD2 = 1498.12f;


        System.out.printf("Product No 1: smartphone,%n" +
                "total sales for %x days is EUR %g,%n" +
                "sales by day is EUR %g,%n" +
                "Product No 2: laptop,%n" +
                "total sales for %x days is EUR %g,%n" +
                "sales by day is EUR %g.", No1Days, No1Days * sBD1, sBD1, No2Days, No2Days * sBD2, sBD2);
    }
}