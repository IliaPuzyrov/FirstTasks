package oopWithClasses.Student;

import Utils.Util;
import oopWithClasses.house.House;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Вася Пупкин Пупкинович", 2003, "Ленина 26/1 Минск", 1234790, 1, 1, 1);
        Student student2 = new Student(2, "Радик Паридархович Джигарханян", 2000, "Владиленова 55 Азербайджан", 5473368, 2, 2, 2);
        Student student3 = new Student(3, "Глория Романовская Ивановна", 2001, "Понамарева 3 Минск", 4758294, 3, 3, 3);
        findFaculty(student1, student2, student3);
        System.out.println(student1 + "факультет 1;курс 1 ");
        System.out.println(student2 + "факультет 2;курс 2 ");
        System.out.println(student1 + "факультет 3;курс 3 ");
        findStudentsByYear(student1, student2, student3);
        System.out.println("список учебной группы" + student1 + student2 + student3);
    }

    private static List<Student> findFaculty(Student student1, Student student2, Student student3) {
        int a = Util.scan("введи номер факультета(их всего 3)");
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
        return list;
    }

    private static List<Student> findStudentsByYear(Student student1, Student student2, Student student3) {
        int a = Util.scan("введите год после которого родился/лись студент/ы");
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
        return list;

    }
}


