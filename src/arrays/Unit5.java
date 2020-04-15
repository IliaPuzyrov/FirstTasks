
        package arrays;

import Utils.Util;

public class Unit5 {
    public static void main(String[] args) {
        int a = Util.scan("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        System.out.println("среднее арифметическое положительных чисел " + findSrArfPlo(array));

    }

    private static int findSrArfPlo(int[] array) {
        int sum = 0;
        int temp = 0;
        int srArfm = 0;
        System.out.println("положительные числа");
        for (int a = 0; a < array.length; a++) {
            if (array[a] > 0) {
                sum += array[a];
                temp++;
                System.out.print(array[a] + " ");
            }
        }
        srArfm = sum / temp;
        System.out.println();
        return srArfm;


    }

}
