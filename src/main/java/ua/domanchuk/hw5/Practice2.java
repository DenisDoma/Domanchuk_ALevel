package ua.domanchuk.hw5;

import java.util.Arrays;

//2. Известен рост каждого из 25 учеников класса. Рост мальчиков условно задан
//   отрицательными числами. Определить средний рост мальчиков и средний рост девочек.
// Пример ввода [160, 150, 148, -160, -170]
public class Practice2 {
    public static void main(String[] args) {
        int[] studentsHeigth = {-150, 160, -151, 165, -155, 180, 170, 183, -167, -158, 189, -170,
                192, -162, 159, -169, 155, 154, 153, 152, -174, -177, -164, 177, 178};
        System.out.println("Средний рост мальчиков составляет " + middleBoysHeight(studentsHeigth));
        System.out.println("Средний рост девоечек составляет " + middleGirlsHeight(studentsHeigth));
    }

    public static double middleBoysHeight(int[] studentsHeight) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < studentsHeight.length; i++) {
            if (studentsHeight[i] < 0) {
                average++;
                sum += studentsHeight[i];
            }
        }
        return Math.abs(sum / average);
    }

    public static double middleGirlsHeight(int[] studentsHeight) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < studentsHeight.length; i++) {
            if (studentsHeight[i] > 0) {
                average++;
                sum += studentsHeight[i];
            }
        }
        return sum / average;
    }
}







