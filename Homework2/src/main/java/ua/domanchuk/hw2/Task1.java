package ua.domanchuk.hw2;

public class Task1 {
    public static void main(String[] args) {
        calculating(8, 4, 5, 3, 6, 9);
    }

    public static void calculating(double x1, double x2, double x3, double y1, double y2, double y3) {
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Такой треугольник не существует");
        else {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь: " + square);
        }
    }
}



