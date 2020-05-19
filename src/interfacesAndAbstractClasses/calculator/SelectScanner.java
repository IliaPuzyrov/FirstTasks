package interfacesAndAbstractClasses.calculator;

import Utils.Util;

public class SelectScanner extends function {
    int scan=Util.scanInt("введите номер действия из перечисленных");

    @Override
    public int findComposition(int scan) {
        return super.findComposition();
    }

    @Override
    public int makeDivision(int scan) {
        return super.makeDivision();
    }

    @Override
    public int findSum(int scan) {
        return super.findSum();
    }

    @Override
    public int findDifference(int scan) {
        return super.findDifference();
    }

    @Override
    public double findSqaredNumber(int scan) {
        return super.findSqaredNumber();
    }

    @Override
    public double findSin(int scan) {
        return super.findSin();
    }

    @Override
    public double findCos(int scan) {
        return super.findCos();
    }

    @Override
    public double findTg(int scan) {
        return super.findTg();
    }

    @Override
    public double findCtg(int scan) {
        return super.findCtg();
    }

    @Override
    public double findRootOrNumber(int scan) {
        return super.findRootOrNumber();
    }
}
