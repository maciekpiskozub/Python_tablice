import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        var emps2 = new ArrayList<Employee>();

        // jeśli wiemy, ile elementów może być w emps:
        emps.ensureCapacity(100); //minimalna wielkość


        emps.add(new Employee("PRZEMEK", 2312));

        var e1 = new Employee("Krzysiek", 21312); // zamiast var może być Employee
        emps.add(e1);

        for (var e: emps) {
            System.out.println(e);
        }

        System.out.println(emps.size()); //ilość elementów w array liście

        System.out.println(emps.get(0)); //pokazuje dany element w array liście
    }
}
