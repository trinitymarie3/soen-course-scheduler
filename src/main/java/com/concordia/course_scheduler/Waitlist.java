package com.concordia.course_scheduler;

import java.util.List;

public class Waitlist {
    private int numOfSpots;
    private Course course;
    private List<Student> students;

    public Waitlist(int numOfSpots, Course course, List<Student> students){
        this.numOfSpots = numOfSpots;
        this.course = course;
        this.students = students;
    }
    public int getNumOfSpots(){
        return numOfSpots;
    }
    public Course getCourse(){
        return course;
    }
    public List<Student> getStudents(){
        return students;
    }
    public void setNumOfSpots(int numOfSpots){
        this.numOfSpots = numOfSpots;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }

}