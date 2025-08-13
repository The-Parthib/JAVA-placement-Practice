public class Inheritance_01 {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.name = "Parthib";
        // p.age = 21;
        // p.age();
        // p.walk();
        // p.walk(4);

        Person p1 = new Person("Rupsa", 20);
        p1.walk(32);

        Developer d1 = new Developer("Riju", 12);
        d1.walk(34);
        d1.walk();
    }
}

class Person {
    int age;
    String name;

    void age() {
        System.out.println(name + " age is " + age);
    }

    void walk() {
        System.out.println(name + " walks");
    }

    void walk(int steps) {
        System.out.println(name + " walks " + steps + " steps");
    }

    // constructor
    // public Person(){
    // System.out.println("Constructor called");
    // }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;

        System.out.println(name + " aged " + age);
    }
}

class Developer extends Person {
    public Developer(String name, int age) {
        super(name, age);

    }

    void walk() { // run time polymorphism
        System.out.println("Developer " + name + " walks");
    }
}
