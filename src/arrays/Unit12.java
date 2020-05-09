package arrays;

import Utils.Util;

import java.util.Arrays;

import static Utils.Util.sortChoice;

public class Unit12 {//работает
    public static void main(String[] args) {
        int a = Util.scanInt("введите размер массива");
        int[] array = Util.array(a);
        Util.print(array);
        sortChoice(array);

    }
}
