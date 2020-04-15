package arrays;

import Utils.Util;

public class Unit1 {
    public static void main(String[] args) {
        int size = Util.scan("введите размер массива: ");
        int[] array = Util.array(size);
        Util.print(array);
        int[] newArray = evenOddMaker(array);
        System.out.print("новый ");
        Util.print(newArray);


    }


    public static int[] evenOddMaker(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (i % 2 != 0) {
                b[i] = 0;
            }
        }
        return b;

    }
}
