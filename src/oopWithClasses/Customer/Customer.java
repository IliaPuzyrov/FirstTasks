package oopWithClasses.Customer;

public class Customer {
    private String name;
    private int numberOfCreditCard;
    private String firstLetterOfName;

    public Customer(String name, int numberOfCreditCard, String firstLetterOfName) {
        this.name = name;
        this.numberOfCreditCard = numberOfCreditCard;
        this.firstLetterOfName = firstLetterOfName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", firstLetterOfName='" + firstLetterOfName + '\'' +
                '}';
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

    public String getFirstLetterOfName() {
        return firstLetterOfName;
    }

    public void setFirstLetterOfName(String firstLetterOfName) {
        this.firstLetterOfName = firstLetterOfName;
    }
}
