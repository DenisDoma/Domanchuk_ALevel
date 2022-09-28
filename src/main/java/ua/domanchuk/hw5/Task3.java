package ua.domanchuk.hw5;
/* 3. Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
которая поменяет местами столбцы и строки.
*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
Изначальный массив не должен измениться    */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillArray(array);
        System.out.println(Arrays.deepToString(array));
        cloneArray(array);
        System.out.println(Arrays.deepToString(cloneArray(array)));
    }
    public static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
    }
    public static int[][] cloneArray(int[][] array) {
        int length = array.length;
        int[][] target = new int[length][array[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(array[i], 0, target[i], 0, array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                target[i][j] = array[j][i];
            }
        }
        return target;
    }
}
