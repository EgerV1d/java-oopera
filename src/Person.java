import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;
    protected int height;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public Person(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public enum Gender {
        MALE,
        FEMALE
    }

    //переопределение методов в родительском классе
    @Override
    public String toString() {
        return "Актер: " + name + " " + surname + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                gender == person.gender &&
                height == person.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
