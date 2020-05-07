package Utils;

import java.util.Arrays;
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
                array[i][j] = (int) ((Math.random() * 10));
            }
        }
        return array;
    }

    public static void printDvumern(int[][] a) {
        System.out.println("двумерный массив");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


    }

    public static void printDouble(double[][] a) {
        System.out.println("двумерный массив");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


    }


    public static int scanInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public static String scanString(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static void bubbleSort(int[] array) {
        boolean a = false;
        int b;
        int c=0;
        while (!a) {
            a = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    a = false;

                    b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                    c++;
                }
            }

        }
        System.out.println("отсортированый массив");
        System.out.println(Arrays.toString(array));
        System.out.println(c+"раз");
    }

    public static void sortChoice(int[] array) {
        for (int min = 0; min < array.length - 1; min++) {
            int a = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[a]) {
                    a = j;
                }
            }
            int b = array[min];
            array[min] = array[a];
            array[a] = b;
        }
        System.out.println("отсортированый массив");
        System.out.println(Arrays.toString(array));
    }
}
