public class Employee {
    private double salary;
    private String name;

    public Employee(){
        this.name="mueen";
        this.salary=33.5;
    }
    public Employee(String name,double salary){
    this.name=name;
    this.salary=salary;

    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String args[]){
        Employee e1=new Employee("mueen",55.5);
        System.out.println("name is "+e1.getName());
        System.out.println("Salary  is "+e1.getSalary());
    }
}

