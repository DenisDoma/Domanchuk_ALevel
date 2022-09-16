package ua.domanchuk.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] randomNums = new int[1000];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println(isPrime(randomNums));
    }

    public static void fillArray(int[] randomNums) {
        Random random = new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(1000);
        }
    }

    public static int isPrime(int[] randomNums) {
        int temp = 0;
        for (int i = 0; i < randomNums.length; i++) {
            boolean isPrime = false;
            if (randomNums[i] == 1)
                isPrime = true;
            else {
                for (int j = 2; j <= randomNums[i] / 2; j++) {
                    if (randomNums[i] % j == 0) {
                        isPrime = true;
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
