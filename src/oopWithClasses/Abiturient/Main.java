package oopWithClasses.Abiturient;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        int j;
        long searchKey;
        for (j = 0; j < n; j++) {
            System.out.println(arr[j] + " ");
            System.out.println("");
            searchKey = 55;
            for (j = 0; j < n; j++) {
                if (arr[j] == searchKey) {
                    break;
                }
                for (int k = j;k<n;k++){
                    arr[k]=arr[k+1];
                    n--;
                    for (j=0;j<n;j++){
                        System.out.println(arr[j] + " ");
                        System.out.println("");
                    }
                }
            }
        }
    }


}
