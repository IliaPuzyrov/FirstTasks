package interfacesAndAbstractClasses.abiturient;

public class StudentExtramural extends Student {
    private String name;
    private int yearOfBirthday;

    public StudentExtramural(String name, int yearOfBirthday) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    @Override
    public String toString() {
        return "StudentExtramural{" +
                "name='" + name + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                '}';
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("будь отличником");
    }

    @Override
    public void doingHomework() {
        super.doingHomework();
        System.out.println("красава чувак");
    }

    @Override
    public void sittingInMobilePhone() {
        super.sittingInMobilePhone();
        System.out.println("будешь блогером!");
    }

    @Override
    public void sign() {
        super.sign();
    }
}
