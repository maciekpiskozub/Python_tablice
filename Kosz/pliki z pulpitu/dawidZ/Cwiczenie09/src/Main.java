// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.name = "Dawid";
//        e1.surname = "Żak";
//        e1.age = 16;

        Programmer e1 = new Programmer("Oliwier", "Koda", 16, 2221);
//        System.out.println(e1);

        Programmer p1 = new Programmer("Paweł", "Lebiedź", 15, 2137);
//        System.out.println(p1);
        Manager m1 = new Manager("manadzer", "manadzerowski", "superFajny", 21);

        Employee[] employees = {e1, p1, m1};

        for (Employee emps : employees
        ) {
            System.out.println(emps);
        }
    }
}

abstract class Employee {
    protected String name;
    protected String surname;
    protected int age;

    public Employee() {
        name = "";
        surname = "";
        age = 0;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    public abstract String describeProfession();
}

class Programmer extends Employee {
    private int salary;

    public Programmer(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String describeProfession() {
        return "Programmer is a person that makes computers go beep. Sometimes they listen";
    }
}
class Manager extends Employee{

    String department;
    public Manager(String name, String surname, String department, int age){
        super(name, surname, age);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String describeProfession() {
        return "Manager is tersone that manages other persons";
    }
}