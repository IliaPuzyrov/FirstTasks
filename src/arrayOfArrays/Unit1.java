package arrayOfArrays;

import Utils.Util;

public class Unit1 {
    public static void main(String[] args) {
        int a = Util.scan("введите количество строк");
        int b = Util.scan("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
    }
}
