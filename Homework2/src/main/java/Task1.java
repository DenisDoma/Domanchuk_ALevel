public class Task1 {
    public static void main(String[] args) {
        double x1 = 7;
        double x2 = 8;
        double x3 = 13;

        double y1 = 5;
        double y2 = 7;
        double y3 = 9;

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



