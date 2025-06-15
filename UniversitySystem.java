// University People System

class Person{
    private String name;
    private int id;
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getRoleDetails(){
        return name + " (" + id + ")";
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}

class Student extends Person{
    private String program;
    public Student(String name,int id,String program){
        super(name,id);
        this.program = program;
    }
    @Override
    public String getRoleDetails(){
        return getName() + "(" + getId() + ") - Student of " + program;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public String getRoleDetails() {
        return getName() + " (" + getId() + ") - Teaches " + subject;
    }
}

class Admin extends Person{
    private String department;
    public Admin(String name,int id,String department){
        super(name, id);
        this.department = department;
    }
    @Override
    public String getRoleDetails(){
        return getName() + "(" + getId() + ") - Admin of " + department + "department."; 
    }
}

public class UniversitySystem{
    public static void main(String[] args) {
        Person[] persons = {
            new Student("Bob", 110, "BCSIT"),
            new Teacher("Levi", 9, "Data Analysis"),
            new Admin("Bolivard", 44,"Finance")
        };
        for(Person p1 : persons){
            System.out.println(p1.getRoleDetails());
        }
    }
}