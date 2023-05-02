public class Main {
    public static void main(String[] args) {
        Employee p = new Professor(1, "Mueen", 1000000.0, "CSE");
        Employee a = new Administrator(2, "Mujahid", 80000.0, "Manager");
        Employee s = new SupportStaff(3, "Muntasir", 70000.0, "constructor");
        Employee s2 = new SupportStaff(3, "Mannan", 60000.0, "janitor");

        System.out.println(p);
        System.out.println(a);
        System.out.println(s);
        System.out.println(s2);

        Employee[] employees = {p,a,s,s2};
        System.out.println("Total Salary: " + Employee.totalSalary(employees));
    }
}