package interfacesAndAbstractClasses.employee;

import java.util.Objects;

public class Suprervisor extends Engineer {
    private String goHome;
    private int workingHours;

    public Suprervisor(String goHome, int workingHours) {
        this.goHome = goHome;
        this.workingHours = workingHours;
    }

    public String getGoHome() {
        return goHome;
    }

    public void setGoHome(String goHome) {
        this.goHome = goHome;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suprervisor that = (Suprervisor) o;
        return workingHours == that.workingHours &&
                goHome.equals(that.goHome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goHome, workingHours);
    }

    @Override
    public String toString() {
        return "Suprervisor{" +
                "goHome='" + goHome + '\'' +
                ", workingHours=" + workingHours +
                '}';
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void dinner() {
        super.dinner();
    }

    @Override
    public void workAtHome() {
        super.workAtHome();
    }

    @Override
    public void ill() {
        super.ill();
    }
}
