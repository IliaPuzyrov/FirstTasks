package Utils;

import java.util.Scanner;

public class Util {
    public static void print(int[] a) {
        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }

    public static int[] array(int a) {
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int[][] arraysOfArrays(int a, int b) {
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static void printDouble(int[][] a) {
        System.out.println("Dvumerniy massiv");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


    }


    public static int scan(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();


    }
}
