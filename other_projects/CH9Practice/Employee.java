/*
Anthony Mui
Apoorva Sannasi
Jared Weinstein
Pranav Rao
Shreay Chigurupati
* */
package other_projects.CH9Practice;

public class Employee {
    private final String name;
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
    public boolean equals(Employee e){
        return ((e.name.equals(this.name) && (e.salary == this.salary)));
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
        super.salary *= 1.2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                '}'+super.toString();
    }
}

class EmployeeTester{
    public static void test(Employee[] l){
        for (Employee i: l) {
            System.out.println(i.getName() + i.getSalary());
            i.setSalary(2);
            i.bonus();
            for (Employee j: l) {
               if(j.equals(i)){
                   System.out.println(11);
               }
            }
            System.out.println((i.equals(l[0])));
            System.out.println(i.toString());
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("e1", 1);
        Employee e1_cp = new Employee("e1", 1);
        Employee e2 = new Employee("e2", 1);
        Employee e3 = new Employee("e3", 1);
        Employee[] l = {e1, e1_cp, e2, e3};
        test(l);
        Manager m1 = new Manager("m1", 1, "1");
        Manager m1_cp = new Manager("m1", 1, "1");
        Manager m2 = new Manager("m2", 1, "1");
        Manager m3 = new Manager("m3", 1, "1");
        Manager[] l2 = {m1, m1_cp, m2, m3};
        test(l2);
        for (Manager i: l2) {
            System.out.println(i.getId());
            i.bonus();
            System.out.println(i.toString());
        }
    }
}