package arrayOfArrays;

import Utils.Util;

public class Unit9 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите количество строк");
        int b = Util.scanInt("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        System.out.println("положительные элементы диагонали матрицы");
        findDiagonal(array);
    }

    private static void findDiagonal(int[][] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] > 0) {
                        System.out.print(array[i][j] + "\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
