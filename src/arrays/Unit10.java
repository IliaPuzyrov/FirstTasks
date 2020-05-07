package arrays;

import Utils.Util;

public class Unit10 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        System.out.println(findMin(array));
    }

    public static int findMin(int[] array) {
        int count = 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                array[min] = array[i];
                count++;
           //     int[min]= 0;


            }
        }
        System.out.println(min);
        System.out.println("первенство минимального значения менялось" + count + "раз");
        return min;

    }

    private static void deleteMin(int[] array, int min) {
        int a = array.length;
        for (int i = 0; i < array.length - 1; i++) {//сдвиг последующих элементов
            array[i] = array[i + 1];
            a--;                            //уменьшение размера

        }
        for (int j = 0; j < a; j++)         //вывод элементов
            System.out.print(array[j] + " ");
        System.out.println("");


    }

    private static void a(int[] array, int min) {
        int[] result = new int[array.length - 1];
        int index = min;
        System.arraycopy(array, 0, result, 0, index);
       System.arraycopy(array, index + 1, result, index, array.length - index - 1);

    }

}

