import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = 0;
        int secondValue = 0;
        int thirdValue = 0;
        System.out.println("Write first value");
        firstValue = scanner.nextInt();
        System.out.println("Write second value");
        secondValue = scanner.nextInt();
        System.out.println("Write third value");
        thirdValue = scanner.nextInt();

            if ((Math.abs(firstValue)) < (Math.abs(secondValue)) && (Math.abs(firstValue)) < (Math.abs(thirdValue))) {
                System.out.println(Math.abs(firstValue));
            } else if ((Math.abs(secondValue)) < (Math.abs(firstValue)) && (Math.abs(secondValue)) < (Math.abs(thirdValue))) {
                System.out.println(Math.abs(secondValue));
            } else {
                System.out.println(Math.abs(thirdValue));
            }
        }
    }




