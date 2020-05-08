package arrays;

import Utils.Util;

public class Unit10 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        System.out.println(deleteMin(array));
    }

    private static int[] deleteMin(int[] array) {

            if (array.length == 0) {
                throw new IllegalArgumentException("Массив нулевой длины!");
            }

            int minCount = 0;
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] <= min) {
                    min = array[i];

                }
            }

            for (int value : array) {
                if (value == min) {
                    minCount++;
                }
            }

            int[] result = new int[array.length - minCount];

            int indexResult = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != min) {
                    result[indexResult] = array[i];
                    indexResult++;
                }
            }
            return result;
        }

    }



