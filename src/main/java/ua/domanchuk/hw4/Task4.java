package ua.domanchuk.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] randomNums = new int[2000];
        fillArray(randomNums);
        System.out.println("Изначальный массив\n " + Arrays.toString(randomNums));
        System.out.println("Массив без четных чисел\n " + Arrays.toString(zeroNums(randomNums)));

    }

    public static void fillArray(int[] randomNums) {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (1 + Math.random() * 10);
        }
    }

    public static int[] zeroNums(int[] randomNums) {
        int[] zeroArrayNums = Arrays.copyOf(randomNums, randomNums.length);
        for (int k = 0; k < zeroArrayNums.length; k++) {
            if (zeroArrayNums[k] % 2 == 0) {
                zeroArrayNums[k] = 0;
            }
        }
        return zeroArrayNums;
    }
}

