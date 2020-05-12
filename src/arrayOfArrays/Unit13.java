package arrayOfArrays;

import Utils.Util;

public class Unit13 {
    public static void main(String[] args) {
        int a = Util.scanInt("введите количество строк");
        int b = Util.scanInt("введите количество столбцов");
        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);
    }
/*
    private static void nullOne(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }
        }*/
    }
