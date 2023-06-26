public class Manager extends Employee{
    public Manager(String name, long salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("Manager work");
    }

    public void manage(){
        System.out.println("manage....");
    }

    @Override
    public long getSalary() {
        return 500 +  super.getSalary();
    }
}