package com.homework.hm4;

import java.util.Scanner;

public class HomeWork4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int days = in.nextInt();
        System.out.println("Введите количество осадков в каждый из дней");
        int sum = 0;
        double mean;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= days; i++) {
            int p = in.nextInt();
            sum = sum + p;
            if (maxValue < p) {
                maxValue = p;
            }
        }
        mean = sum / days;

        System.out.println("Выбранный период: " + days + " дней");
        System.out.println("Сумма осадков: " + sum);
        System.out.println("Среднее количество осадков: " + mean);
        System.out.println("Максимальное количесвто осадков: " + maxValue);


    }
}