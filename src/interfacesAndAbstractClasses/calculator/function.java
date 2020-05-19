package interfacesAndAbstractClasses.calculator;

import Utils.Util;

public class function implements Calculate {
    @Override
    public int findComposition(int scan) {
        int a = Util.scanInt("введите число");
        int b = Util.scanInt("введите число");
        int composition = a * b;
        return composition;
    }

    @Override
    public int makeDivision(int scan) {
        int a = Util.scanInt("введите число");
        int b = Util.scanInt("введите число");
        int division = a / b;
        return division;
    }

    @Override
    public int findSum(int scan) {
        int a = Util.scanInt("введите число");
        int b = Util.scanInt("введите число");
        int sum = a + b;
        return sum;
    }

    @Override
    public int findDifference(int scan) {
        int a = Util.scanInt("введите число");
        int b = Util.scanInt("введите число");
        int difference = a - b;
        return difference;
    }

    @Override
    public double findSqaredNumber(int scan) {
        double a = Util.scanInt("введите число");
        double b = Util.scanInt("запрос желаемой степени");
        double sqare = Math.pow(a, b);
        return sqare;
    }

    @Override
    public double findSin(int scan) {
        int catet = Util.scanInt("введите противолежащий катет");
        int gip = Util.scanInt("введите гипотенузу");
        double sin = catet / gip;
        return sin;
    }

    @Override
    public double findCos(int scan) {
        int catet = Util.scanInt("введите прилежащий катет");
        int gip = Util.scanInt("введите гипотенузу");
        double cos = catet / gip;
        return cos;
    }

    @Override
    public double findTg(int scan) {
        int catet = Util.scanInt("введите противолежащий катет");
        int catet1 = Util.scanInt("введите прилежащий катет");
        double tg = catet / catet1;
        return tg;
    }

    @Override
    public double findCtg(int scan) {
        int catet1 = Util.scanInt("введите прилежащий катет");
        int catet = Util.scanInt("введите противолежащий катет");
        double ctg = catet1 / catet;
        return ctg;
    }

    @Override
    public double findRootOrNumber(int scan) {
        int a = Util.scanInt("введите число");
        double root = Math.sqrt(a);
        return root;

    }
}
