package interfacesAndAbstractClasses.calculator;

import java.util.Scanner;

public class SelectableFunctions {
    public static int selectFuncions() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            if (scanner.nextInt() > 10) {
                System.out.println("введите другой номер операции");
                return scanner.nextInt();
            }
        }
        return scanner.nextInt();
    }

}
