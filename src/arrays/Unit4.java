package arrays;

import Utils.Util;

public class Unit4 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите рвзмер массива");
        int[] array = Util.array(a);
        Util.print(array);
        findElements(findSumma(array),array,a);


    }

    private static int findSumma(int[] array) {

        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            sum += array[a];

        }
        return sum;
    }

    private static void findElements(int sum, int[] array,int size) {
        double srArf = 0;
        for (int a = 0; a < array.length; a++) {
            srArf = (sum / size);
            if (array[a] < srArf) {
                System.out.println(array[a]);

            }
        }


    }
}


