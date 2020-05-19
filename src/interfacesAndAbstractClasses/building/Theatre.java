package interfacesAndAbstractClasses.building;

import java.util.Objects;

public class Theatre extends PublicBuilding {
    private int yearsOfServise;
    private String louds;

    public Theatre(int yearsOfServise, String louds) {
        this.yearsOfServise = yearsOfServise;
        this.louds = louds;
    }

    public int getYearsOfServise() {
        return yearsOfServise;
    }

    public void setYearsOfServise(int yearsOfServise) {
        this.yearsOfServise = yearsOfServise;
    }

    public String getLouds() {
        return louds;
    }

    public void setLouds(String louds) {
        this.louds = louds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theatre theatre = (Theatre) o;
        return yearsOfServise == theatre.yearsOfServise &&
                louds.equals(theatre.louds);
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "yearsOfServise=" + yearsOfServise +
                ", louds='" + louds + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearsOfServise, louds);
    }

    @Override
    public void build() {
        super.build();
    }

    @Override
    public void shatter() {
        super.shatter();
    }

    @Override
    public void throuthRepair() {
        super.throuthRepair();
    }
}
