package arrayOfArrays;

import Utils.Util;

public class Unit4 {
    public static void main(String[] args) {
        int a = Util.scan("введите количество строк");
        int b = Util.scan("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        System.out.println("сумма равна " + findDobleSum(array));
    }

    private static int findDobleSum(int[][] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];

            }
        }
        return sum;

    }

}
