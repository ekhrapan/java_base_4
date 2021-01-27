package academy.belhard;

public class Main {

    public static void main(String[] args) {
//        Person p1 = new Person("Tom", "Hardy", 40);
//        Person p2 = new Person("Tom", "Cruz", 56);
//        Person p3 = new Person(p1);
//        p3.setFirstName("Robert");
//
//        p1.changeObject(p2);
//
//        String fullName1 = p1.getFullName();
//        String fullName2 = p2.getFullName();
//        String fullName3 = p3.getFullName();
//
//        System.out.println(fullName1);
//        System.out.println(fullName2);
//        System.out.println(fullName3);

        System.out.println(fact(3));
        System.out.println(fact(4));
        System.out.println(fact(5));
        System.out.println(fact(6));
        System.out.println(fact(11));
    }

    static int fact(int number) {
        if (number == 1) {
            return 1;
        }

        return number * fact(number - 1);
    }
}
