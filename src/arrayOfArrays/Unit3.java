package arrayOfArrays;

import Utils.Util;

public class Unit3 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите количество строк");
        int b = Util.scanInt("введите количество столтбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        System.out.println();
        findElements(array, a, b);

    }

    private static void findElements(int[][] array, int a, int b) {


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j += 2) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + "\t");


                }
            }
            System.out.println();
        }
    }


}
