package arrays;

import Utils.Util;

public class Unit10 {//какая то фигня получается.спросить у О.Б.

    public static void main(String[] args) {
        int a = Util.scanInt("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        System.out.println("минимальное" + findMin(array));
        System.out.println(deleteMin(findMin(array),array));

    }

    private static int findMin(int[] array) {

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
        return min;
    }

    private static int[] deleteMin(int min, int[] arr) {
        int n=arr.length;
        int j;
        long searchKey;
        for (j = 0; j < n; j++) {
            System.out.println(arr[j] + " ");
            System.out.println("");
            searchKey = min;
            for (j = 0; j < n; j++) {
                if (arr[j] == searchKey) {
                    break;
                }
                for (int k = j; k < n; k++) {
                    arr[k] = arr[k + 1];
                    n--;
                    for (j = 0; j < n; j++) {
                        System.out.println(arr[j] + " ");
                        System.out.println("");
                    }
                }
            }
        }return arr;

    }
}
