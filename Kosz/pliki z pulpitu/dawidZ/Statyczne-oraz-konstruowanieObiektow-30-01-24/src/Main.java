import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] argbbs) {
        Employee e1 = new Employee();
        e1.setSomething();
        System.out.println(e1);

        Employee e2 = new Employee();
        System.out.println(e2);

        System.out.println(new Employee());

        System.out.println(Employee.getNextId());

        Manager m1 = new Manager(); // utworzenie obiektu
        System.out.println(m1.id);

        Employee[] emps = {e1, e2, m1};
        for (Employee e : emps) {
            System.out.println(e);
        }
        System.out.println(Manager.getNextId());
    }
}
// final = stała
class Employee {
    private final StringBuilder stringBuilder;
    public  int id;
    private static int nextId = 1;
    // statyczna stała musi mieć coś przypisane np. private static nextId= 1;

    public static int getNextId(){
        return nextId;
    }
    public Employee(){
        stringBuilder = new StringBuilder();
        id = nextId++;
        System.out.println("Utworzono Employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    public void setSomething() {
        stringBuilder.append(1234); // działa - można korzystać z utworzonego obiektu
        //stringBuilder = new StringBuilder();// nie działa - nie można zmienić obiektu
    }
}
class Manager extends Employee{
    public Manager(){
        System.out.println("Utworzono Manager");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                '}';
    }
    public void setBonus(float percent){
        return;
    }
}