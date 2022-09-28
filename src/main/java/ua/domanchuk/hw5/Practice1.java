package ua.domanchuk.hw5;
//1. Известны данные о стоимости каждого из 12 товаров. Найти общую стоимость тех товаров,
//которые стоят дороже 1000 uah (количество таких товаров неизвестно).

public class Practice1 {
    public static void main(String[] args) {
        int[] price = {500, 400, 700, 4000, 7000, 1500, 1000, 200, 100, 670, 380, 3400};
        System.out.println(bigPriceSum(price));
    }

    public static int bigPriceSum(int[] price) {
        int sum = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] >= 1000) {
                sum += price[i];
            }
        }
        return sum;
    }
}


