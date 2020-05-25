package interfacesAndAbstractClasses.Doctor;

public class Neurosurgeon extends Surgeon{
    public String lateToDinner;
    @Override
    public void treat() {
        super.treat();
    }

    @Override
    public void speakWithPatient() {
        super.speakWithPatient();
    }

    @Override
    public void doingOperations() {
        super.doingOperations();
    }

    @Override
    public void workWithOutDinner() {
        super.workWithOutDinner();
    }

    public Neurosurgeon(String lateToDinner) {
        this.lateToDinner = lateToDinner;
    }

    public String getLateToDinner() {
        return lateToDinner;
    }

    public void setLateToDinner(String lateToDinner) {
        this.lateToDinner = lateToDinner;
    }

    @Override
    public String toString() {
        return "Neurosurgeon{" +
                "lateToDinner='" + lateToDinner + '\'' +
                '}';
    }
}
