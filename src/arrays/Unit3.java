package arrays;

import Utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Unit3 {
    public static void main(String[] args) {
        int n = Util.scan("vvedite razmer massiva");
        int[] i = Util.array(n);
        Util.print(i);
        System.out.println(oddArrayMaker(i));

    }

    private static String oddArrayMaker(int[] a) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                arrayList.add(a[i]);

            }


        }
        return arrayList.toString();

    }


}
