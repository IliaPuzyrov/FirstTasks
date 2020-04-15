package arrayOfArrays;

import Utils.Util;

public class Unit6 {
    public static void main(String[] args) {
        int a = Util.scan("введите количество строк");
        int b = Util.scan("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        System.out.println("диагональ матрицы");
        findDiagonal(array);
    }

    private static void findDiagonal(int[][] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {

                    System.out.print(array[i][j] + "\t");


                }
            }
            System.out.println();
        }
    }
}
