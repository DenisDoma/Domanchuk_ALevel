package ua.domanchuk.hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] randomNums = new int[400];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println("Среднее значение массива = " + getArrayAverage(randomNums));
        System.out.println("Среднее геометрическое массива = " + getArrayAverageGeometric(randomNums));

    }

    public static void fillArray(int[] randomNums) {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (1 + Math.random() * 10);
        }
    }

    public static double getArrayAverage(int[] randomNums) {
        double average = 0;
        if (randomNums.length > 0) {
            int sum = 0;
            for (int j = 0; j < randomNums.length; j++) {
                sum += randomNums[j];
            }
            average = sum / randomNums.length;
        }
        return average;
    }
        public static double getArrayAverageGeometric ( int[] randomNums){
            double geometricAverage = 1;
            for (int i : randomNums) {
                geometricAverage *= i;
            }
            return Math.pow(geometricAverage, 1.0/randomNums.length);
        }
    }

