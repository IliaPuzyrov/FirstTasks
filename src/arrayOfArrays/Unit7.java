package arrayOfArrays;

import Utils.Util;

public class Unit7 {
    public static void main(String[] args) {
        int a = Util.scan("введите количество строк");
        int b = Util.scan("введите количество столбцов");
        int k = Util.scan("введите номер строки");
        int p = Util.scan("введите номер столбца");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
        System.out.println("результат действия");
        findColumnAndLine(array, k, p);
    }

    private static void findColumnAndLine(int[][] a, int k, int p) {
        System.out.println("заданный столбец:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][p] + "\t");
        }
        System.out.println();
        System.out.println("заданная строка:");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[k][j] + "\t");
        }
    }
}
