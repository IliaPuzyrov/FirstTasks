package arrayOfArrays;

import Utils.Util;

public class Unit11 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите количество строк");
        int b = Util.scanInt("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        findMax(array);
    }

    private static void findMax(int[][] array) {
        int max = array[0][0];
        int neh=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] % 2 != 0) {
                    array[i][j] = neh;
                    neh=max;
                }


            }


        }
        System.out.println("максимальное число"+max);
    }

}

