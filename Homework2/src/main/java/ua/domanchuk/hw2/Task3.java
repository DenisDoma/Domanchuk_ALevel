package ua.domanchuk.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        System.out.println("Write first value");
        firstValue = scanner.nextInt();
        System.out.println("Write second value");
        secondValue = scanner.nextInt();
        System.out.println("Write third value");
        thirdValue = scanner.nextInt();

        int min = Math.abs(firstValue) > Math.abs(secondValue) ? Math.abs(thirdValue) < Math.abs(firstValue) ?
                Math.abs(firstValue) : Math.abs(thirdValue) > Math.abs(secondValue) ? Math.abs(secondValue) :
                Math.abs(thirdValue) : Math.abs(thirdValue) < Math.abs(secondValue) ? Math.abs(secondValue) :
                Math.abs(thirdValue) > Math.abs(firstValue) ? Math.abs(firstValue) : Math.abs(thirdValue);
        System.out.println("Минимальное по модулю = " + min);
    }
}







