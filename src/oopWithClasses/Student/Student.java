package oopWithClasses.Student;

public class Student {
    private int id;
    private String NamesureNamePatronymic;
    private int yearOfBurning;
    private String adres;
    private int telefone;
    private int faculty;
    private int course;
    private int group;

    public Student(int id, String namesureNamePatronymic, int yearOfBurning, String adres, int telefone, int faculty, int course, int group) {
        this.id = id;
        NamesureNamePatronymic = namesureNamePatronymic;
        this.yearOfBurning = yearOfBurning;
        this.adres = adres;
        this.telefone = telefone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public int group() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", NamesureNamePatronymic='" + NamesureNamePatronymic + '\'' +
                ", yearOfBurning=" + yearOfBurning +
                ", adres='" + adres + '\'' +
                ", telefone=" + telefone +
                ", faculty=" + faculty +
                ", course='" + course + '\'' +

                ",group'" + group + '\'' +
                '}';
    }

    public void setCourse(String course) {
        course = course;
    }public void setGroup(String courseGroup) {
        course = course;
    }
}
