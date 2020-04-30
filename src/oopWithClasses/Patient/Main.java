package oopWithClasses.Patient;

import Utils.Util;
import oopWithClasses.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("пневмания", 1);
        Patient patient2 = new Patient("идиотизм", 2);
        Patient patient3 = new Patient("аллергия", 3);
        System.out.println(findDiagnoz(patient1, patient2, patient3));
        System.out.println(findNumberOfCard(patient1, patient2, patient3));
    }

    private static List<Patient> findDiagnoz(Patient patient1, Patient patient2, Patient patient3) {
        String a = Util.scanString("в данном случае,для поиска диагноза, введите пневмония/идиотизм/аллергия");
        List<Patient> list = new ArrayList<>();
        if (patient1.getDiagnoz() == a) {
            list.add(patient1);
        }
        if (patient2.getDiagnoz() == a) {
            list.add(patient2);
        }
        if (patient3.getDiagnoz() == a) {
            list.add(patient3);

        }
        return list;

    }

    private static List<Patient> findNumberOfCard(Patient patient1, Patient patient2, Patient patient3) {
        List<Patient> listPatient = new ArrayList<>();
        int b = Util.scanInt("введите номер карты для поиска пациэнта");
        if (patient1.getCardNumber() == b) {
            listPatient.add(patient1);
        }
        if (patient2.getCardNumber() == b) {
            listPatient.add(patient1);

        }
        if (patient3.getCardNumber() == b) {
            listPatient.add(patient3);
        }
        return listPatient;
    }


}


