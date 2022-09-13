package ua.domanchuk.hw3;
//3. Подсчитать количество слов в строке
//• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество
//слов в ней.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите что-то в одну строку");
        String firstLine = scanner.nextLine();
        countingWords(firstLine);

    }

    static void countingWords(String firstLine) {
        int count = 0;
        if (firstLine.length() != 0) {
            count++;
            for (int j = 0; j < firstLine.length(); j++) {
                if (firstLine.charAt(j) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы написали " + count + " слов(а)");
    }

}
