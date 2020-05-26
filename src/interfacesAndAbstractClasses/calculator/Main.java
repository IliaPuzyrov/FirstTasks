package interfacesAndAbstractClasses.calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите действие: ");
        System.out.println("1-умножение;\t 2-деление;\t 3-плюс;\t 4-минус; \t 5-возведение степень;" +
                " \t 6-sin;\t 7-cos;\t 8-tg;\t 9-ctg;\t 10-корень от числа");
        Functions functions = new Functions();
        int selectFunction = SelectableFunctions.selectFuncions();
        int a = SelectableNumbers.scannerInt("Введите число");
        int b = SelectableNumbers.scannerInt("Введите число");
        if (selectFunction == 1) {
            System.out.println("Результат: " + functions.findComposition(a, b));
        }
        if (selectFunction == 2) {
            System.out.println("Результат: " + functions.makeDivision(a, b));
        }
        if (selectFunction == 3) {
            System.out.println("Результат: " + functions.findSum(a, b));
        }
        if (selectFunction == 4) {
            System.out.println("Результат: " + functions.findDifference(a, b));
        }
        if (selectFunction == 5) {
            System.out.println("Результат: " + functions.findSqaredNumber(a, b));
        }
        if (selectFunction == 6) {
            System.out.println("Результат: " + functions.findSin(a));
        }
        if (selectFunction == 7) {
            System.out.println("Результат: " + functions.findCos(a));
        }
        if (selectFunction == 8) {
            System.out.println("Результат: " + functions.findTg(a));
        }
        if (selectFunction == 9) {
            System.out.println("Результат: " + functions.findCtg(a));
        }
        if (selectFunction == 10) {
            System.out.println("Результат: " + functions.findRootOrNumber(a));
        }

    }

}
