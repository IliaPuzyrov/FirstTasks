package arrayOfArrays;

import Utils.Util;

public class Unit1 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите количество строк");
        int b = Util.scanInt("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
    }
}
