package com.company;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int odds = 0;
        int number;

        System.out.println("Enter integers:");

        do {
            number = scanner.nextInt();

            if (number != 0 && number % 2 != 0) {
                odds += number;
            }
        }

        while (number != 0);

        System.out.println("Sum of odd integers : " + odds);

        scanner.close();
    }
}