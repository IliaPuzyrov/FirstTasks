package oopWithClasses.Student;

import Utils.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Вася Пупкин Пупкинович", 2003, "хим-био", 2, 3);
        Student student2 = new Student("Радик Паридархович Джигарханян", 2000, "физ-мат", 4, 3);
        Student student3 = new Student("Глория Романовская Ивановна", 2001, "фил", 3, 2);
        Student student4 = new Student("Мария Промакашкина Ахмедовна", 2001, "фил", 3, 2);
        System.out.println(findFaculty(student1, student2, student3, student4));
      //  findByFacultyAndCourse(student1, student2, student3, student4);
        System.out.println(findCourse(student1, student2, student3, student4));
        System.out.println(findStudentsByYear(student1, student2, student3, student4));
        getGroup(student1,student2,student3,student4);


    }

    private static void getGroup(Student student1, Student student2, Student student3, Student student4) {
        List<Student> listGroup2 = new ArrayList<>();
        List<Student> listGroup3 = new ArrayList<>();

        int a = 2;
        if (student1.getGroup() == a) {
            listGroup2.add(student1);
        } else {
            listGroup3.add(student1);
        }
        if (student2.getGroup() == a) {
            listGroup2.add(student2);
        } else {
            listGroup3.add(student2);
        }
        if (student3.getGroup() == a) {
            listGroup2.add(student3);
        } else {
            listGroup3.add(student3);
        }
        if (student4.getGroup() == a) {
            listGroup2.add(student4);
        } else {
            listGroup3.add(student4);
        }
        System.out.println("студенты учащиеся в группе 2");
        System.out.println(listGroup2);
        System.out.println("студенты учащиеся в группе 3");
        System.out.println(listGroup3);
    }

    private static void findByFacultyAndCourse(Student student1, Student student2, Student student3, Student student4) {
        System.out.println("студенты,принадлежащие одному факльтету: ");
        findFaculty(student1, student2, student3, student4);
        System.out.println("студенты,учащиеся в одном курсе");
        findCourse(student1, student2, student3, student4);


    }

    private static List<Student> findCourse(Student student1, Student student2, Student student3, Student student4) {
        List<Student> listCourse = new ArrayList<>();
        int a = Util.scanInt("введите номер курса для поиска студента");
        if (student1.getCourse() == a) {
            listCourse.add(student1);
        }
        if (student2.getCourse() == a) {
            listCourse.add(student2);

        }
        if (student3.getCourse() == a) {
            listCourse.add(student3);
        }
        if (student4.getCourse() == a) {
            listCourse.add(student4);
        }
        return listCourse;
    }

    private static List<Student> findFaculty(Student student1, Student student2, Student student3, Student student4) {
        String a = Util.scanString("в данном случае введите фил/физ-мат/хим-био");
        List<Student> list = new ArrayList<>();
        if (student1.getFaculty() == a) {
            list.add(student1);
        }
        if (student2.getFaculty() == a) {
            list.add(student2);
        }
        if (student3.getFaculty() == a) {
            list.add(student3);
        }
        if (student4.getFaculty() == a) {
            list.add(student4);
        }
        return list;
    }

    private static List<Student> findStudentsByYear(Student student1, Student student2, Student student3, Student
            student4) {
        int a = Util.scanInt("введите год после которого родился/лись студент/ы");
        System.out.println("выведен/ны студент/ты с заданнвми параметрами");
        List<Student> list = new ArrayList<>();
        if (student1.getYearOfBurning() >= a) {
            list.add(student1);
        }
        if (student2.getYearOfBurning() >= a) {
            list.add(student2);
        }
        if (student3.getYearOfBurning() >= a) {
            list.add(student3);
        }
        if (student4.getYearOfBurning() >= a) {
            list.add(student4);
        }
        return list;

    }
}


