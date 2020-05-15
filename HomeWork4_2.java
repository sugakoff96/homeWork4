package com.homework.hm4;

import java.util.Scanner;

public class HomeWork4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = in.nextInt();
        int x = 1;
        int y = 1;
        int z;
        System.out.print(x + " " + y + " ");
        for (int i = 3; ; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
            if (z >= value) {
                break;
            }
        }
    }
}
