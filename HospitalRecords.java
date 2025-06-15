// Hospital Patient Records
class Patient{
    private String name;
    private int age;
    public Patient(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getTreatmentPlan(){
        return "General Treatment Plan for patient.";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class InPatient extends Patient{
    private int roomNumber;
    public InPatient(String name, int age,int roomNumber){
        super(name, age);
        this.roomNumber = roomNumber;
    }

    @Override
    public String getTreatmentPlan() {
        return "In-Patient Treatment Plan: Room Number " + roomNumber + ". Includes 24/7 care and medication.";
}
}

class OutPatient extends Patient{
    private String appointmentDate;
    public OutPatient(String name, int age,String appointmentDate){
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String getTreatmentPlan(){
        return "Out-Patient Treatment Plan: Appointment on " + appointmentDate + ". Includes routine check-up.";
    } 
}

public class HospitalRecords {
    public static void main(String[] args) {
        Patient[] pt = {
            new InPatient("Alice", 30, 101),
            new OutPatient("Bob", 25, "2025-06-20")
        };

        for (Patient p : pt) {
            System.out.println(p.getName() + " (" + p.getAge() + " years): " + p.getTreatmentPlan());
        }
    }
}