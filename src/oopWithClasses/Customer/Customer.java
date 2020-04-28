package oopWithClasses.Customer;

public class Customer {
    private String name;
    private int numberOfCreditCard;

    public Customer(String name, int numberOfCreditCard) {
        this.name = name;
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                '}';
    }
}
