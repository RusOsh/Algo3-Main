package com.rus;

import java.util.Scanner;

public class Main {
    public static boolean isResultOk = false;
    public static int middle = 0;
    public static int temp = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число ");
        int start = scanner.nextInt();
        System.out.println("Введите конечное число ");
        int end = scanner.nextInt();
        System.out.println("Введите число которое хотите найти ");
        int x = scanner.nextInt();
        binarySearch(start , end , x);
    }

    public static void linearSearch(int start, int end, int x) {
        for (int i = start; i <= end; i++) {
            if (i == x) {
                isResultOk = true;
                temp = i;
                break;
            }
        }
        if (isResultOk) {
            System.out.println("Элемент найден!");
            System.out.println(temp);
        } else {
            System.out.println("Элемент не найден!");
        }
    }

    public static void binarySearch(int start, int end, int x) {
        end = end - 1;
        int i = 1;
        while (start < end) {
            middle = (start + end) / 2;
            if (x == middle) {
                start = middle;
                end = start;
                isResultOk = true;
                temp = middle;
            } else {
                if (x > middle) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        if (isResultOk) {
            System.out.println("Элемент найден!");
            System.out.println(temp);
        } else {
            System.out.println("Элемент не найден!");
        }
    }
}