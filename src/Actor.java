import java.util.Objects;

public class Actor extends Person{

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }


    @Override
    public String toString() {
        return "Актер: " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        return obj != null && getClass() == obj.getClass();
    }

    /* IDEA предалагает заменить этот кусок в equals() на тот, что сейчас в переопределении. Я правильно понимаю,
    что это просто укороченная версия с абсолютно такой же логикой?
        if (obj == null || getClass() != obj.getClass()) return false;
            return true; */

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
