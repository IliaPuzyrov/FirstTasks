package arrays;

import Utils.Util;

public class Unit8 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите длину массива: ");
        int[] array = Util.array(a);
        Util.print(array);
        System.out.println("максимальная сумма:");
        System.out.println(findMaxSum(array));

    }public static int findMaxSum(int[] array) {
        int a = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > a) {
                a = array[i] + array[array.length - i - 1];
            }

        }
        return a;
    }
}
