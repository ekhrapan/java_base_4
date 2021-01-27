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

    // конструктор клонирования
    public Person(Person person) {
        firstName = person.firstName;
        lastName = person.lastName;
        age = person.age;
    }

    // конструктор по-умолчанию
    public Person() {
    }

    String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    // [напишите метод, который возвращает фамилию, имя и возраст человека - Иванов Иван, 45 лет]

    // метод с параметром
    void setFirstName(String firstName) {
        if (!firstName.isBlank()) {
            this.firstName = firstName;
        }
    }

    // [написать метод setAge, который будет валидтровать поле age от 0 до 120]

    // сравнение объектов
    boolean theSamePerson(Person person) {
        return this.firstName.equals(person.firstName) &&
                this.lastName.equals(person.lastName) &&
                this.age == person.age;
    }

    // [перегрузите метод getFullName, чтобы он сначала выводил имя,. затем фамилию]

    void printName() {
        System.out.println(firstName);
    }

    void changeObject(Person person) {
        person.lastName += "!!!!!";
    }
}
