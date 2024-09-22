import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(numberLetterInEnglishAlphabet("a"));
        System.out.println(numberLetterInEnglishAlphabet("Z"));

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Мария", 45, Person.Gender.FEMALE));
        persons.add(new Person("Петр", 34, Person.Gender.MALE));
        persons.add(new Person("Наталия", 41, Person.Gender.FEMALE));
        persons.add(new Person("Константин", 23, Person.Gender.MALE));
        persons.add(new Person("Зинаида", 55, Person.Gender.FEMALE));
        persons.add(new Person("Просковья", 67, Person.Gender.FEMALE));
        persons.add(new Person("Кирилл", 44, Person.Gender.MALE));
        persons.add(new Person("Олег", 45, Person.Gender.MALE));
        persons.add(new Person("Кристина", 19, Person.Gender.FEMALE));
        persons.add(new Person("Тимофей", 88, Person.Gender.MALE));
        System.out.println(getPersonsByGender(persons, Person.Gender.FEMALE));
    }

    /**
     * 1. Необходимо написать метод, который возвращает позицию буквы алфавита.
     * Для реализации программы создать enum алфавита.
     */
    static int numberLetterInEnglishAlphabet(String letter) throws Exception {
        if (letter.length() != 1) throw new Exception("required 1 symbol");
        return EnglishAlphabet.valueOf(letter.toUpperCase()).ordinal() + 1;
    }

    /**
     * 2. Написать класс Person с полями имени(name), возраста(age).
     * Для определения пола Person создать enum Gender с соответствующими константами.
     * В классе с методом main создать список объектов Person, состоящий не менее, чем из 10 человек разного пола.
     * Написать метод, возвращающий список объектов класса Person в зависимости от введенного параметра пола,
     * т.е. список мужчин или женщин.
     */
    static List<Person> getPersonsByGender(List<Person> persons, Person.Gender gender) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.gender.equals(gender)) result.add(person);
        }
        return result;
    }
}