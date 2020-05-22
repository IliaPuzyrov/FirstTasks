package interfacesAndAbstractClasses.calculator;

public class Functions implements Calculate {
    @Override
    public int findComposition(int a, int b) {
        return a * b;
    }

    @Override
    public int makeDivision(int a, int b) {
        return a / b;
    }

    @Override
    public int findSum(int a, int b) {
        return a + b;
    }

    @Override
    public int findDifference(int a, int b) {
        return a - b;
    }

    @Override
    public double findSqaredNumber(int a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double findSin(double a) {
        return Math.sin(a);
    }

    @Override
    public double findCos(double a) {
        return Math.cos(a);
    }

    @Override
    public double findTg(double a) {
        return Math.tan(a);
    }

    @Override
    public double findCtg(double a) {
        return 1 / Math.tan(a);
    }

    @Override
    public double findRootOrNumber(int a) {
        return Math.sqrt(a);

    }

}

