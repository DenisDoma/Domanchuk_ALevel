package ua.domanchuk.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] randomNums = new int[2000];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        zeroNums(randomNums);
        System.out.println(Arrays.toString(randomNums));

    }

    public static void fillArray(int[] randomNums) {
        Random random = new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(2000);
        }
    }

    public static void zeroNums(int[] randomNums) {
        for (int k = 0; k < randomNums.length; k++) {
            if (k % 2 == 0) {
                randomNums[k] = 0;
            }
        }
    }
}

