package ex04_operators;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static double summa;

    //Первая строка содержит цену на мясо
    //Вторая строка содержит процент в качестве чаевых
    //Третья строка содержит процент в качестве налогов
    //Необходимо вывести итоговую сумму
    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

    //Метод, который выводит на экран итоговую сумму, округленную в сторону ближайшего целого
    //Метод Math.round() округляет дробь до целого числа.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double summa = Math.round(100 +
                tip_percent +
                tax_percent) *
                meal_cost / 100;
        System.out.println("summa = " + Math.round(summa));
    }
}
