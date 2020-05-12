package oopWithClasses.Abiturient;

public class Abiturient {
    private int mark1;
    private int mark2;
    private int mark3;

    public Abiturient(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                '}';
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }
}
