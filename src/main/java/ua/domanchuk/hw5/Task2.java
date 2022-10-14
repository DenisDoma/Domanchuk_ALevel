package ua.domanchuk.hw5;
/* 2. Проверить, заданный массив на упорядоченность по невозрастанию, т. е. определить,
        верно ли, что каждый его элемент, начиная со второго, не больше предыдущего.
        *передать массив в метод, получить boolean       */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {600, 590, 500, 499, 498, 497, 496, 449, 448};
        System.out.println(Arrays.toString(array));
        System.out.println(checkNextElement(array));
    }

    public static boolean checkNextElement(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.println("Массив не упорядочен по невозрастанию");
                return false;
            }
        }
        System.out.println("Массив упорядочен по невозрастанию");
        return true;
    }
}