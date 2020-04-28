package oopWithClasses.Student;

public class Student {
    private String NamesureNamePatronymic;
    private int yearOfBurning;
    private String faculty;
    private int course;
    private int group;

    public Student(String namesureNamePatronymic, int yearOfBurning, String faculty, int course, int group) {
        NamesureNamePatronymic = namesureNamePatronymic;
        this.yearOfBurning = yearOfBurning;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getNamesureNamePatronymic() {
        return NamesureNamePatronymic;
    }

    public void setNamesureNamePatronymic(String namesureNamePatronymic) {
        NamesureNamePatronymic = namesureNamePatronymic;
    }

    public int getYearOfBurning() {
        return yearOfBurning;
    }

    public void setYearOfBurning(int yearOfBurning) {
        this.yearOfBurning = yearOfBurning;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NamesureNamePatronymic='" + NamesureNamePatronymic + '\'' +
                ", yearOfBurning=" + yearOfBurning +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}

