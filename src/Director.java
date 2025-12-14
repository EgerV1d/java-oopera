import java.util.Objects;

public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер: " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        return obj != null && getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }

}
