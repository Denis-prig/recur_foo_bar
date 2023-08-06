package org.arishin;

import java.util.Scanner;

public class Main {
    private static int n;

    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        n = Integer.valueOf(number);
        System.out.println("====");
        ToRecursive(1);
    }

    private static void ToRecursive(int x) {
        if (x > n) {
            return;
        }
        if ((x % 3 == 0) && (x % 5 == 0)) {
            System.out.println("FooBar");

        } else if (x % 3 == 0) {
            System.out.println("Foo");
        } else if (x % 5 == 0) {
            System.out.println("Bar");
        } else {
            System.out.println(x);
        }
        ToRecursive(x + 1);
    }
}






