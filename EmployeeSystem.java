
// Employee Management System
class Employee{ // name and id are private, so they are not directly accessible in subclasses.

   protected String name;
    protected int id;
    protected double baseSalary;
    public Employee(String name, int id, double baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    @Override
public String toString() {
    return "Employee [Name: " + name + ", ID: " + id + ", Salary: " + calculateSalary() + "]";
}

    public double calculateSalary(){
        return baseSalary;
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager( String name, int id, double baseSalary, double bonus){
        super(name, id,baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + bonus ;
    }
} //  salary = base + overtimeHours * rate
class Developer extends Employee{
    private int overTimeHours;
    private double hourlyRate;
    public Developer(String name, int id, double baseSalary, int overTimeHours, double hourlyRate){
        super(name,id,baseSalary);
        this.overTimeHours = overTimeHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return baseSalary + (overTimeHours* hourlyRate);
    }
}
public class EmployeeSystem{
    public static void main(String[] args){
        Manager m1 = new Manager("Tom",101, 5000,1200);
        Developer d1  = new Developer("Henry", 102, 4000, 50, 20);
        System.out.println(m1);
        System.out.println(d1);
    }
}