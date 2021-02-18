package other_projects.CH9Practice;

public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary){
       this.name = name;
       this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void bonus(){
       this.salary *= 1.1;
    }
    public void equals(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Manager extends Employee{
    private final String id;
    public Manager(String name, double salary, String id){
        super(name, salary);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void bonus(){
        //this.salary *= 1.2;
    }
}

class EmployeeTester{
    public static void main(String[] args) {
       Employee x = new Employee("x", 1);
        System.out.println(x.getName()+x.getSalary());
        x.setSalary(2);
        x.bonus();
        x.equals();
        x.toString();
    }
}