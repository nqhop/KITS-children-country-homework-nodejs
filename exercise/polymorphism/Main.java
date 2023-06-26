import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("e1", 1500);
        System.out.println(e1.getName() + " " + e1.getSalary());
        e1.work();

        System.out.println();
        Developer d1 = new Developer("D1", 1500);
        System.out.println(d1.getName() + " " + d1.getSalary());
        d1.coding();

        System.out.println();
        Salesperson s1 = new Salesperson("S1", 1500);
        System.out.println(s1.getName() + " " + s1.getSalary());
        s1.sale();

        System.out.println();
        Manager m1 = new Manager("M1", 1500);
        m1.setSalary(2000);
        System.out.println(m1.getName() + " " + m1.getSalary());
        m1.manage();

        System.out.println();
        Employee m2 = new Manager("M2", 2000);
        System.out.println(m2.getName() + " " + m2.getSalary());

        List<Employee> employees = new ArrayList<>();
        employees.add(s1);
        employees.add(m1);
        System.out.println(employees);
    }
}
