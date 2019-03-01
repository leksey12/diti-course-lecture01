package ex03_data_type;

import java.util.Scanner;

public class Solution {
    private static String p;

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "DITI ";

        Scanner scan = new Scanner(System.in);

        /* Объявите для каждого типа: целочисленный, с плавающей точкой двойной точности, строка - вторую переменную. */

        //TODO: заполните значение каждой переменной тем, что введено в стандартный поток ввода
        //К примеру:
        //5
        //3.14
        //is the best place to learn and practice coding!

        //TODO: Напечатайте сумму целых значений

        //TODO: Напечатайте сумму дробных чисел

        //TODO: напечатайте результат конкатенации строк

        int b;
        double v = 4.0;
        String s1 = "DITI ";

        b = scan.nextInt();
       double c = scan.nextDouble();
        scan.nextLine();
         p =scan.nextLine();

        int sum1= i+b;
        System.out.println(sum1);
        double sum2= c+v;
        System.out.println(sum2);
        String sum3 = s+p;
        System.out.println(sum3);
        scan.close();
    }
}
