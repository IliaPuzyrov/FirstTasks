package oopWithClasses.Patient;

public class Patient {
    String diagnoz;
    int cardNumber;

    public Patient(String diagnoz, int cardNumber) {
        this.diagnoz = diagnoz;
        this.cardNumber = cardNumber;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnoz='" + diagnoz + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
