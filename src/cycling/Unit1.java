package cycling;

import Utils.Util;

public class Unit1 {
    public static void main(String[] args) {
        char simvol = 'i';
        switch (simvol) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("glasniye");
                break;
            case 'y':
            case 'w':
                System.out.println("uslouno glasnye");
                break;


            default:
                System.out.println("soglasniye");
                break;
        }
    }
}
