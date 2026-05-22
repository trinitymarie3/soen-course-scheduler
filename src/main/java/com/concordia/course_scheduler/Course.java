package com.concordia.course_scheduler;

import java.util.List;

public class Course {
    private String name, courseId;
    private int capacity, seatsAvailable;
    private List<Course> prerequisites;

    public Course(String name, String courseId, int capacity, int seatsAvailable, List<Course> prerequisites) {
        this.name = name;
        this.courseId = courseId;
        this.capacity = capacity;
        this.seatsAvailable = seatsAvailable;
        this.prerequisites = prerequisites;
    }

    public String getName(){
        return name;
    }
    public String getCourseId(){
        return courseId;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getSeatsAvailable(){
        return seatsAvailable;
    }
    public List<Course> getPrerequisites(){
        return prerequisites;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourseId(String courseId){
        this.courseId = courseId;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setSeatsAvailble(int seatsAvailable){
        this.seatsAvailable = seatsAvailable;
    }
    public void setPrerequisites(List<Course> prerequisites){
        this.prerequisites = prerequisites;
    }
    @Override
    public String toString(){
        return "\nCourse " + name + courseId + ":\nCapacity: " + capacity + "\nSeatsAvailable: " + seatsAvailable + "\n";
    }
}
