package arrays;

import Utils.Util;

public class Unit7 {
    public static void main(String[] args) {
        int b = Util.scan("введите число квадрат которого хотите найти в массиве");
        int a = Util.scan("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        findSquare(array, b);


    }

    private static void findSquare(int[] array, int b) {
        for (int i = 0; i < array.length; i++) {
            if (i == Math.pow(b, 2)) {
                System.out.println("в данном массиве присутствует квадрат/ты этого числа: " + i);


            }


        }
    }
}
