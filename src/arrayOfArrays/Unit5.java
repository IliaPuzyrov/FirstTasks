package arrayOfArrays;

import Utils.Util;

public class Unit5 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите количество строк");
        int b = Util.scanInt("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        System.out.println("количество '-1' встречается " + findNumberOfNegative(array) + " раз");
    }

    private static int findNumberOfNegative(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == -1) {
                    count++;

                }
            }
        }
        return count;


    }

}
