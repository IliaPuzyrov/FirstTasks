package arrays;

import Utils.Util;

public class Unit9 {//работает
    public static void main(String[] args) {
        int a = Util.scanInt("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
findMin(array);
findMax(array);

    }

    public static int findMax(int[] array) {
        int count = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                count++;

            }
        }
        System.out.println("максимальное  "+max);
        System.out.println("первенство максимального значения менялось" + count + "раз");
        return max;
    }

    public static int findMin(int[] array) {
        int count = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                count++;


            }
        }
        System.out.println("минимальное  "+min);
        System.out.println("первенство минимального значения менялось" + count + "раз");
        return min;

    }
}
