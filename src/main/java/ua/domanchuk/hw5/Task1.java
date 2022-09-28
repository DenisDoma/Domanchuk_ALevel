package ua.domanchuk.hw5;
/* 1. Заполнение двумерного массива значениями индекса(от 1 и до кол-ва элементов в
        массиве), при этом каждая вторая строка - отрицательными значениями.
        Например
        1 2 3
        -4 -5 -6
        7 8 9
        -10 -11 -12
        *Передать массив в метод, заполнить данный массив */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillArray(array);
    }
    public static int[][] fillArray(int[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k + 1;
                k++;
                if (i % 2 != 0)
                    array[i][j] = k * (-1);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }
}

