package Basic;

import Utils.Util;

/*
Find math operations with Math.*
 */
public class Unit1 {
    public static void main(String[] args) {
        int a = Util.scanInt("Введите число");
        int c = 4;
        double d;
        d = (4 * a * c - (Math.sqrt(9 - Math.pow(a, 2))) / 2 * a);
        System.out.println(d);
    }
}
