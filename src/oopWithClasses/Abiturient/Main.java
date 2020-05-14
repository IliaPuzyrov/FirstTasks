package oopWithClasses.Abiturient;

public class Main {
    public static void main(String[] args) {
        Abiturient abiturient1 = new Abiturient("Леша", 4, 5, 6);
        Abiturient abiturient2 = new Abiturient("Таня", 8, 9, 10);
        Abiturient abiturient3 = new Abiturient("Даник", 5, 6, 9);
        Abiturient abiturient4 = new Abiturient("Даша", 8, 9, 3);
        badAbiturient(abiturient1, abiturient2, abiturient3, abiturient4);
    }

    private static void badAbiturient(Abiturient abiturient1, Abiturient abiturient2, Abiturient abiturient3, Abiturient abiturient4) {
        if (abiturient1.getMark1() < 7 && abiturient1.getMark2() < 7 &&
                abiturient1.getMark3() < 7) {
            System.out.println("этот абитуриентабитуриент" + abiturient1.getName() + " имеет неуд. оценку ");


        }
        if (abiturient2.getMark2() < 7 && abiturient2.getMark2() < 7 &&
                abiturient2.getMark3() < 7) {
            System.out.println("этот абитуриентабитуриент " + abiturient2.getName() + "имеет неуд. оценку ");


        }
        if (abiturient3.getMark3() < 7 && abiturient3.getMark2() < 7 &&
                abiturient3.getMark3() < 7) {
            System.out.println("этот абитуриентабитуриент " + abiturient1.getName() + "имеет неуд. оценку ");


        }
        if (abiturient4.getMark1() < 7 && abiturient4.getMark2() < 7 &&
                abiturient4.getMark3() < 7) {
            System.out.println("этот абитуриентабитуриент" + abiturient2.getName() + " имеет неуд. оценку ");


        }
    }

}
