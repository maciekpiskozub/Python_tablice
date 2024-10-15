public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Bartek", 21);
        System.out.println(p1);

        Student s1 = new Student("Kamil", 20, 20);
        System.out.println(s1);
    }
}

class Person{
    protected String name;
    protected int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name = '" + name + '\'' +
                ", age = " + age;
    }
}

class Student extends Person{
    protected int StudentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student: " +
                "StudentId = " + StudentId +
                ", name = '" + name + '\'' +
                ", age = " + age;
    }
}