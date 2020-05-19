package interfacesAndAbstractClasses.calculator;

public class function1 implements Calculate1 {
    @Override
    public int findComposition1(int a, int b,int scan) {
        int composition = a * b;
        return composition;
    }

    @Override
    public int makeDivision1(int a, int b,int scan) {
        int division = a / b;
        return division;
    }

    @Override
    public int findSum1(int a, int b,int scan) {
        int sum = a + b;
        return sum;
    }

    @Override
    public int findDifference1(int a, int b,int scan) {
        int difference = a - b;
        return difference;
    }

    @Override
    public double findSqaredNumber1(double a,int scan) {
        return 0;
    }

    @Override
    public double findSqaredNumber1(int a, int b,int scan) {
        double sqare = Math.pow(a, b);
        return sqare;
    }

    @Override
    public double findSin1(int catetПротиволежащий, int gip,int scan) {
        double sin = catetПротиволежащий / gip;
        return sin;
    }

    @Override
    public double findCos1(int catetПрилежащий, int gip,int scan) {
        double cos = catetПрилежащий / gip;
        return cos;
    }

    @Override
    public double findTg1(int catetПротиволежащий, int catetПрилежащий,int scan) {
        double tg = catetПрилежащий / catetПротиволежащий;
        return tg;
    }

    @Override
    public double findCtg1(int catetПрилежащий, int catetПротиволежащий,int scan) {
        double ctg = catetПрилежащий / catetПротиволежащий;
        return ctg;
    }

    @Override
    public double findRootOrNumber1(int a,int scan) {
        double root = Math.sqrt(a);
        return root;

    }
}

