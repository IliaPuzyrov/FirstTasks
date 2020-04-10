package arrays;

import Utils.Util;

public class Unit2 {

    public static void main(String[] args) {
        int[] array1 = Util.array(5);
        int[] array2 = Util.array(5);
        Util.print(array1);
        Util.print(array2);
        System.out.println(overageArifmiticColculate(array1));
        System.out.println(overageArifmiticColculate(array2));
        moreLessDefiner(overageArifmiticColculate(array1), overageArifmiticColculate(array2));

    }

    public static double overageArifmiticColculate(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double srednee = sum / 5;
        return srednee;

    }

    public static void moreLessDefiner(double a, double b) {
        if (a > b) {
            System.out.println(a + " bolshe " + b);
        } else if (a == b) {
            System.out.println(a + " ravno " + b);

        } else {
            System.out.println(a + " menshe " + b);
        }

    }


}
