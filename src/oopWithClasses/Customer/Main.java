package oopWithClasses.Customer;

import Utils.Util;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mark", 10, "M");
        Customer customer2 = new Customer("David", 20, "D");
        Customer customer3 = new Customer("Valentina", 30, "V");
        findNameByAlfabet(customer1, customer2, customer3);
        findNameByAlfabet(customer1,customer2,customer3);
    }

    private static void findNameByAlfabet(Customer customer1, Customer customer2, Customer customer3) {
        String a = "D";
        String b = "M";
        String c = "V";
        if (customer1.getName() == b) {
            System.out.println("первый по алфавиту: " + customer1);
        }
        if (customer2.getName() == a) {
            System.out.println("второй по алфавиту: " + customer2);
        }
        if (customer3.getName() == c) {
            System.out.println("второй по алфавиту: " + customer3);
        }
    }

    private static void findCostumersBuNomberOfCreditCard(Customer customer1, Customer customer2, Customer customer3) {
        int a = Util.scan("введите номер после которого ищете пользователя");
        int b = Util.scan("введите номер до которого ищете пользователя");
        if (a<=customer1.getNumberOfCreditCard()<=b){
            System.out.println(customer1);
        }if (a<=customer2.getNumberOfCreditCard()<=b){
            System.out.println(customer2);
        }if (a<=customer3.getNumberOfCreditCard()<=b){
            System.out.println(customer3);
        }
    }
}
