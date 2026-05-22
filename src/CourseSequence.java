package src;
import java.util.List;

public class CourseSequence {
    List<Course> courses;
    private String semesterName;

    public CourseSequence(List<Course> courses, String semesterName) {
        this.courses = courses;
        this.semesterName = semesterName;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public String getSemesterName(){
        return semesterName;
    }
    public void setCourses(List<Course> courses){
        this.courses = courses;
    }
    public void setSemesterName(String semesterName){
        this.semesterName = semesterName;
    }

}
