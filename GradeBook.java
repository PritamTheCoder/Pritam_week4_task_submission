
// Student Grade Book
class Student{
    private String name;
    private int rollNumber;
    private int[] marks;
    public Student(String name, int rollNumber, int [] marks){
        this.name = name;
        this. rollNumber = rollNumber;
        this.marks = marks;
    }
// getter 
public String getName(){
    return name;
}
public int getRollNumber(){
    return rollNumber;
}
public int[] getMarks(){
    return marks;
}
// setter
public void setName(String name){
    this.name = name;
}
public void setRollNumber(int rollNumber){
    this.rollNumber = rollNumber;
}
public void setMarks(int[] marks){
    this.marks = marks;
}
public double calculateAverage(){
    int sum = 0;
    for (int mark : marks){
        sum += mark;
    }
    // Ensure we don't divide by zero. If marks exist, calculate the average; otherwise, return 0
    return marks.length > 0 ? (double) sum/ marks.length : 0;
}
}

class GraduateStudent extends Student{
    private String thesisTopic;
    public GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic){
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }
    public String getThesisTopic(){
        return thesisTopic;
    }
    public void setThesisTopic(String thesisTopic){
        this.thesisTopic = thesisTopic;
    }
    public void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
public class GradeBook{
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, new int[]{85, 90, 78});
        GraduateStudent gradStudent = new GraduateStudent("Bob", 201, new int[]{88, 92, 80}, "Artificial Intelligence");
         System.out.println(student.getName() + "'s Average Marks: " + student.calculateAverage());
        System.out.println(gradStudent.getName() + "'s Average Marks: " + gradStudent.calculateAverage());
        gradStudent.printThesisTitle();
    }
}