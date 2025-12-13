import java.util.Objects;

public class Actor extends Person{

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }


    @Override
    public String toString() {
        return "Актер: " + name + " " + surname + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // можно оформить и так
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                height == actor.height;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash = name.hashCode();
        }
        if (surname != null) {
            hash = hash + surname.hashCode();
        }
        return hash;
    }

}
