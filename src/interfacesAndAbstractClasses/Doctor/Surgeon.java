package interfacesAndAbstractClasses.Doctor;

public abstract class Surgeon implements Doctor{
    @Override
    public void treat() {
        System.out.println("постельный режим");
    }

    @Override
    public void speakWithPatient() {
        System.out.println("Спокойствие!Только спокойствие");

    }

    @Override
    public void doingOperations() {
        System.out.println("Анестезия...");

    }
    public void workWithOutDinner(){
        System.out.println("Танечка,принесите мне что-нибудь из столовой");
    }
}
