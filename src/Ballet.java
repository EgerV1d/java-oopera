import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    @Override
    public void printLibretto() {
        System.out.println("Либретто для баллета " + title + ':');
        System.out.println(getLibrettoText());
    }
}
