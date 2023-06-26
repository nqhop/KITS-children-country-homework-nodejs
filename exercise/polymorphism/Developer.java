public class Developer extends Employee{

    public Developer(String name, long salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("I'm a developer");
    }

    public void coding(){
        System.out.println("Coding......");
    }

    @Override
    public long getSalary() {
        return 100 + super.getSalary();
    }
}