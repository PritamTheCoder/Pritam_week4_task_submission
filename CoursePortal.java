// Online Course Portal

class Course{
    private String title;
    private int duration;
    private String instructor;

    public Course(String title, int duration, String instructor){
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getCourseInfo(){
        return "Course: " + title + ", Duration: " + duration + " hours, Instructor: " + instructor;
    }
}

class LiveCourse extends Course{
    private String scheduleTime;

    public LiveCourse(String title, int duration, String instructor, String scheduleTime){
        super(title,duration,instructor);
        this.scheduleTime = scheduleTime;
    }

    @Override
    public String getCourseInfo(){
        return super.getCourseInfo() + ", Schedule : " + scheduleTime;
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    public RecordedCourse(String title, int duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Video Lessons: " + videoCount;
    }
}

public class CoursePortal{
    public static void main(String[] args) {
        Course[] courses = {
            new LiveCourse("Java", 2, "Daniel T. Thomas", "Mon-Thu, 9am"),
            new RecordedCourse("Python", 4, "Robert J. K.", 5)
        };
        for(Course c : courses){
            System.out.println(c.getCourseInfo());
        }
    }
}