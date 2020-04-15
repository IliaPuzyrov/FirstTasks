package arrayOfArrays;

import Utils.Util;

public class Unit1 {
    public static void main(String[] args) {
        int a = Util.scan("Vvedite kolichestvo strok");
        int b = Util.scan("Vvedite kolichestvo stolbcov");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
    }
}
