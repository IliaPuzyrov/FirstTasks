package arrayOfArrays;

import Utils.Util;

public class Unit3 {
    public static void main(String[] args) {
        int a = Util.scan("введите количество строк");
        int b = Util.scan("введите количество столтбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDouble(array);
        System.out.println();
        findElements(array, a, b);

    }

    private static void findElements(int[][] array, int a, int b) {
        int min = array[0][0];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                if (j % 2 != 0) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                        System.out.print(array[i][j] + " ");
                    }


                }
            }
            System.out.println();
        }
    }


}
