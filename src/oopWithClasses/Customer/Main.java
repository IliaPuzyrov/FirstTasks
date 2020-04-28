package oopWithClasses.Customer;

import Utils.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mark", 10);
        Customer customer2 = new Customer("David", 20);
        Customer customer3 = new Customer("Valentina", 30);
        System.out.println(findNameByAlfabet(customer1, customer2, customer3));
        findCostumersBuNomberOfCreditCard(customer1,customer2,customer3);
    }

    private static List<String> findNameByAlfabet(Customer customer1, Customer customer2, Customer customer3) {
        List<String> list = new ArrayList<>();
        list.add(customer1.getName());
        list.add(customer2.getName());
        list.add(customer3.getName());
    Collections.sort(list);
    return list;



    }

    private static void findCostumersBuNomberOfCreditCard(Customer customer1, Customer customer2, Customer customer3) {
        int a = Util.scanInt("введите номер после которого ищете пользователя");
        int b = Util.scanInt("введите номер до которого ищете пользователя");
        if (a<=customer1.getNumberOfCreditCard() && customer1.getNumberOfCreditCard()<=b){
            System.out.println(customer1);
        }if (a<=customer2.getNumberOfCreditCard()&& customer2.getNumberOfCreditCard()<=b){
            System.out.println(customer2);
        }if (a<=customer3.getNumberOfCreditCard()&& customer3.getNumberOfCreditCard()<=b){
            System.out.println(customer3);
        }
    }

}
