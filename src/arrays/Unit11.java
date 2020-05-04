package arrays;

import Utils.Util;

public class Unit11 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        findTheMostCommonNumber(array);
    }

    private static void findTheMostCommonNumber(int[] array) {
        int a = 0;
        int d = 0;
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    a = array[i];
                    d++;

                }

            }
            System.out.println("элемент " + a + " встречается " + d + " раз\n");

        }
    }

}

