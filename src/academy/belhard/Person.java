package academy.belhard;

public class Person {
    // поля класса
    String firstName;
    String lastName;
    int age;

    // конструктор
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // конструктор по-умолчанию
    public Person() {
    }

    String getFullName(){
        return firstName + " " + lastName;
    }

    // [напишите метод, который возвращает фамилию, имя и возраст человека - Иванов Иван, 45 лет]

    // метод с параметром
    void setFirstName(String name) {
        if (!name.isBlank()) {
            firstName = name;
        }
    }

    // сравнение объектов
    boolean theSamePerson(Person person) {
        return this.firstName.equals(person.firstName) &&
                this.lastName.equals(person.lastName) &&
                this.age == person.age;
    }

    // [перегрузите метод getFullName, чтобы он сначала выводил имя,. затем фамилию]
}
