package arrayOfArrays;

import Utils.Util;

public class Unit8 {
    public static void main(String[] args) {
        int a = Util.scan("введите размер матрицы");
        double[][] array = new double[a][a];
        Util.printDouble(createArray(array));
    }

    private static double[][] createArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / array.length);
            }

        }
        return array;
    }
}
