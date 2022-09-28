package ua.domanchuk.hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] randomNums = new int[1000];
        fillArray(randomNums);
        System.out.println(Arrays.toString(randomNums));
        System.out.println(isComposite(randomNums));
    }

    public static void fillArray(int[] randomNums) {
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (1 + Math.random() * 10);
        }
    }

    public static int isComposite(int[] randomNums) {
        int temp = 0;
        for (int randomNum : randomNums) {
            boolean isComposite = false;
            if (randomNum == 4)
                isComposite = true;
            else {
                for (int j = 2; j <= randomNum / 2; j++) {
                    if (randomNum % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
            }
            if (isComposite) {
                temp++;
            }
        }
        return temp;
    }
}
