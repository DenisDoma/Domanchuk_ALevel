package ua.domanchuk.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] randomNums = new int[1000];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println(isSimple(randomNums));
    }

    public static void fillArray(int[] randomNums) {
        Random random = new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(1000);
        }
    }

    public static int isSimple(int[] randomNums) {
        int temp = 0;
        for (int i = 0; i < randomNums.length; i++) {
            boolean isPrime = true;
            if (randomNums[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= randomNums[i] / 2; j++) {
                    if (randomNums[i] % j == 0) {
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

