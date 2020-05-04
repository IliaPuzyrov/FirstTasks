package arrayOfArrays;

import Utils.Util;

public class Unit10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[][] array = Util.arraysOfArrays(a, b);
        Util.printDvumern(array);

        findRepretitionOfNumber5(array);
    }

    private static void findRepretitionOfNumber5(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.println("в строчке " + i+ " число 5 повторилось " + counter + " раз/a");
            }

        }
    }
}
