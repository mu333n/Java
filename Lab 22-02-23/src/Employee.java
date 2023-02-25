public class Employee extends Person {
    private String name;
    private int  id;
    private double salary;
    public Employee(String newName,int newId,double newSalary){
        this.name=newName;
        this.id=newId;
        this.salary=newSalary;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setId(int newId){
        this.id=newId;
    }
    public void setSalary(double newSalary){
        this.salary=newSalary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }

}
