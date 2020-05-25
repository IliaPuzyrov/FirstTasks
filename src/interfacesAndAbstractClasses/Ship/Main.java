package interfacesAndAbstractClasses.Ship;

public class Main {
    public static void main(String[] args) {
        AircraftCarrier aircraftCarrier=new AircraftCarrier("разрывные");
        aircraftCarrier.Fire();
        aircraftCarrier.motorDrive();
        aircraftCarrier.sail();
        aircraftCarrier.turn();
    }

}
