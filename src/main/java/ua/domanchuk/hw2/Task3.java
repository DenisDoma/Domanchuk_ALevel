package ua.domanchuk.hw2;

public class Task3 {
    public static void main(String[] args) {
        smallestValue(6, -5, 45);

    }

    public static void smallestValue(int firstValue, int secondValue, int thirdValue) {
        int absValue1 = (firstValue < 0) ? firstValue * -1 : firstValue;
        int absValue2 = (secondValue < 0) ? secondValue * -1 : secondValue;
        int absValue3 = (thirdValue < 0) ? thirdValue * -1 : thirdValue;
        if (absValue1 < absValue2 && absValue1 < absValue3) {
            System.out.println("Минимальное значение " + firstValue);
        } else if (absValue2 < absValue1 && absValue2 < absValue3) {
            System.out.println("Минимальное значение " + secondValue);
        } else {
            System.out.println("Минимальное значение " + thirdValue);
        }

    }
}


















