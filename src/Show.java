import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printAllActors() {
        System.out.println("Список актеров спектакля " + '"' + title + '"' + ':');
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле " + title + " пока нет ни одного актера.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            System.out.println((i + 1) + ". " + actor.getName() + " " + actor.getSurname() +
                    " (" + actor.getHeight() + " см)");
        }
    }

    public boolean addActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("Ошибка: Null");
        }

        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актер уже добавлен в спектакль");
            return false;
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor.name + " " + newActor.surname + " добавлен в список актеров для " +
                    "выступления в спектакле " + '"' + title + '"');
            return true;
        }
    }

    public boolean replaceActor(String surnameToReplace, Actor newActor) {
        if (surnameToReplace == null || surnameToReplace.isEmpty()) {
            System.out.println("Ошибка Null");
            return false;
        }

        if (newActor == null) {
            System.out.println("Ошибка Null");
            return false;
        }

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surnameToReplace)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println(actor + " заменен на " + newActor);
                return true;
            }
        }
        System.out.println("Актер с фамилией " + surnameToReplace + " не найден, замена невозможна");
        return false;
    }

}
