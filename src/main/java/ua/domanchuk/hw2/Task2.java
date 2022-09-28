package ua.domanchuk.hw2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(divideByTwo(30));
    }

    static boolean divideByTwo(int even) {
        if (even % 2 == 0) {
            System.out.println("Число " + even + " является четным");
            return true;
        } else {
            System.out.println("Число " + even + " является нечетным");
        }
        return false;
    }
}

