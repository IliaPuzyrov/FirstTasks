package interfacesAndAbstractClasses.Film;

import java.util.Objects;

public class Comedy extends DomesticFilm {
    public String interesting;
    public Comedy(String interesting) {
        this.interesting = interesting;
    }

    public String getInteresting() {
        return interesting;
    }

    public void setInteresting(String interesting) {
        this.interesting = interesting;
    }

    @Override
    public String toString() {
        return "Comedy{" +
                "interesting='" + interesting + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comedy comedy = (Comedy) o;
        return Objects.equals(interesting, comedy.interesting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interesting);
    }

    @Override
    public void watch() {
        super.watch();
    }

    @Override
    public void year() {
        super.year();
    }
}
