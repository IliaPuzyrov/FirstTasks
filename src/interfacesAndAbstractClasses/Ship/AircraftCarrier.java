package interfacesAndAbstractClasses.Ship;

import java.util.Objects;

public class AircraftCarrier extends RebelShip{
    private String shells;
    @Override
    public void sail() {
        super.sail();
    }

    @Override
    public void turn() {
        super.turn();
    }

    @Override
    public void motorDrive() {
        super.motorDrive();
    }

    public AircraftCarrier(String shells) {
        this.shells = shells;
    }

    @Override
    public void Fire() {
        super.Fire();
    }

    public String getShells() {
        return shells;
    }

    public void setShells(String shells) {
        this.shells = shells;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AircraftCarrier that = (AircraftCarrier) o;
        return Objects.equals(shells, that.shells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shells);
    }

    @Override
    public String toString() {
        return "AircraftCarrier{" +
                "shells='" + shells + '\'' +
                '}';
    }
}
