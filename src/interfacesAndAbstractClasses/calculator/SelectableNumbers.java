package interfacesAndAbstractClasses.calculator;

import java.util.Scanner;

public class SelectableNumbers {
    public static int scannerInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double scannerDouble(String message){
        System.out.println(message);
        Scanner scanner=new Scanner(System.in);
        return scanner.nextDouble();

    }

}
