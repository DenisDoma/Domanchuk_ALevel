package ua.domanchuk.hw3;
// 2. Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)
//Например, задание 2:
// Считать строку из консоли.
// Передать в метод, который удалит из нее все пробелы.
// Передать строку без пробелов в метод, который определит, является ли она палиндромом
//(перевертышем), т.е. одинаково пишется как с начала, так и с конца.
// Вывести результат в main()


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пропишите строку:");
        String firstLine = in.nextLine();
        System.out.println(palindromeWords(wordsWithoutSpaces(firstLine)));
    }

    static public String wordsWithoutSpaces(String fixLine) {
        return fixLine.replaceAll(" ", "");
    }

    static boolean palindromeWords(String finalLine) {
        for (int i = 0; i < (finalLine.length() / 2); i++) {
            if (finalLine.charAt(i) != finalLine.charAt(finalLine.length() - i - 1)) {
                System.out.println(finalLine + " Это не паллиндром");
                return false;
            }
        }
        System.out.println(finalLine + " Это паллиндром");
        return true;
    }
}

