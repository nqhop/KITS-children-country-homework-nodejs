public class Salesperson extends Employee {

    public Salesperson(String name, long salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("I am salesperson!");

    }

    public void sale() {
        System.out.println("Sale product ......");
    }

    @Override
    public long getSalary() {
        return 400 + super.getSalary();
    }
}