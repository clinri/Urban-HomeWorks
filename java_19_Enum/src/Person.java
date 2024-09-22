public class Person {
    String name;
    int age;
    Gender gender;

    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender.getGender() +
                '}';
    }

    enum Gender {
        MALE("Мужчина"),
        FEMALE("Женщина");

        private final String gender;

        Gender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }
    }
}
