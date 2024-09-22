import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        countListStringStartByLetter();
        filterByAge();
    }

    /**
     * 1. Создайте список типа String, например, названия пищевых продуктов.
     * Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы,
     * с использованием потоков.
     */
    public static void countListStringStartByLetter() {
        List<String> products = List.of("молоко", "колбаса", "картошка", "лук", "помидоры");
        char charForFilter = 'К';
        int count = (int) products.stream()
                .filter(s -> Character.toUpperCase(s.charAt(0)) == Character.toUpperCase(charForFilter))
                .count();
        System.out.println(count);
    }

    /**
     * 2. Создать класс Person с полями name и age. В классе с методом main создать список, состоящий не менее,
     * чем из 10 объектов класса Person с произвольными данными. Отфильтровать и вывести в консоль объекты Person,
     * возраст которых более 30 лет.
     */
    public static void filterByAge() {
        int ageForFilter = 30;
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Мария", 45));
        persons.add(new Person("Петр", 34));
        persons.add(new Person("Наталия", 41));
        persons.add(new Person("Константин", 23));
        persons.add(new Person("Зинаида", 55));
        persons.add(new Person("Просковья", 67));
        persons.add(new Person("Кирилл", 44));
        persons.add(new Person("Олег", 45));
        persons.add(new Person("Кристина", 19));
        persons.add(new Person("Тимофей", 88));
        persons.stream()
                .filter(person -> person.age > ageForFilter)
                .forEach(System.out::println);
    }
}

