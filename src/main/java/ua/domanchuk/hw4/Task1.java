package ua.domanchuk.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] randomNums = new int[10];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println(getArrayAverage(randomNums));
        System.out.println(getArrayAverageGeometric(randomNums));

    }

public static void fillArray(int [] randomNums){
        Random random = new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(10);
        }
    }

    public static int getArrayAverage(int[] randomNums) {
        int sum = 0;
        int average;
        for (int j = 0; j < randomNums.length; j++) {
            sum = sum + randomNums[j];
        }
        average = sum / randomNums.length;
        return average;
    }
    public static double getArrayAverageGeometric(int[] randomNums) {
        int geometricAverage = 1;
        for (int i = 0; i < randomNums.length; i++) {
            geometricAverage *= randomNums[i];
            Math.pow (geometricAverage,1.0/randomNums.length);
        }
        return geometricAverage;
    }
}
