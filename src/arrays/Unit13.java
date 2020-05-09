package arrays;

import Utils.Util;

import java.util.Arrays;

import static Utils.Util.bubbleSort;

public class Unit13 {//работает
    public static void main(String[] args) {
        int a = Util.scanInt("введите размер стартового массива");
        int[] array = Util.array(a);
        System.out.println("стартовый массив");
        Util.print(array);
       bubbleSort(array);

    }
}

