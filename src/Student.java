package src;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> completedCourses;
    private List<Course> registeredCourses;

    public Student(String name, int studentId, List<Course> completedCourse, List<Course> registeredCourse){
        this.name = name;
        this.studentId = studentId;
        this.completedCourses = completedCourse;
        this.registeredCourses = registeredCourse;
    }
    public String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public List<Course> getCompletedCourses(){
        return completedCourses;
    }
    public List<Course> getRegisteredCourses(){
        return registeredCourses;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setCompletedCourses(List<Course> completedCourses){
        this.completedCourses = completedCourses;
    }
    public void setRegisteredCourses(List<Course> registeredCourses){
        this.registeredCourses = registeredCourses;
    }
    public void addToCourse(Course course){

    }
    public void joinWaitlist(){

    }
}
