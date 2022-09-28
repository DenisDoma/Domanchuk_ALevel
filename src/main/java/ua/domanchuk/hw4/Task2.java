package ua.domanchuk.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] randomNums = new int[1000];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println(isPrime(randomNums));
    }

    public static void fillArray(int[] randomNums) {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (1 + Math.random() * 10);
        }
    }

    public static int isPrime(int[] randomNums) {
        int temp = 0;
        for (int randomNum : randomNums) {
            boolean isPrime = true;
            if (randomNum == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= randomNum / 2; j++) {
                    if (randomNum % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                temp++;
            }
        }
        return temp;
    }
}

