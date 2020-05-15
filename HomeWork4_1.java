package com.homework.hm4;

import java.util.Scanner;

public class HomeWork4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        double value = in.nextDouble();
        if (isInteger(value)) {
            System.out.println("Введенное число " + value + " не является целым");
            System.exit(0);
        }

        double k = value;
        double s = 0;
        while (k != 0) {
            s += k % 10;
            k /= 10;
            k = Math.floor(k);

        }

        System.out.println("Сумма цифр в числе " + value + " = " + s);
    }

    public static boolean isInteger(double value) {
        double y = value % 1;
        return y != 0;

    }

}
