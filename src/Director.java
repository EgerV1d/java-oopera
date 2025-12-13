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
        return "Режиссер: " + name + " " + surname;
    }
}
