package ex05_conditional_statements;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    //Вводится целое положительное число n: 1<=n<=100:
    //Нужно:
    //Если число нечетное, вывести "Weird"
    //Если число четное и в диапазоне от 2 до 5 (включая границы), то вывести "Not Weird"
    //Если число четное и в диапазоне от 6 до 20 (включая границы), то вывести "Weird"
    //Если число четное и больше 20, то вывести "Not Weird"
    public static void main(String[] args) {

        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Введите целое, положительное число от 1-100");
        int n = scanner.nextInt();
        //TODO:
            if(n >= 2 && n <= 5 && n % 2 == 0)
                System.out.println("Not Weird " + n + " Четное от 2 до 5");
            if(n >= 6 && n <= 20 && n % 2 == 0)
                System.out.println("Weird " + n + " Четное от 6 до 20");
            if(n > 20 && n % 2 == 0)
                System.out.println("Not Weird " + n + " Четное > 20");
            if(n >= 1 && n <= 100 && n % 2 !=0)
            System.out.println("Weird " + n + " Нечетное от 1 до 100");
            if(n > 100 )
        System.out.println("Число "+ n +" за пределами 1<=n<=100");
        scanner.close();
    }
}