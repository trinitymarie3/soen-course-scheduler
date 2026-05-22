package com.concordia.course_scheduler;

import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> completedCourses;
    private List<Course> registeredCourses;
    private List<Course> plannedCourses;

    public Student(String name, int studentId, List<Course> completedCourse, List<Course> registeredCourse, List<Course> plannedCourses) {
        this.name = name;
        this.studentId = studentId;
        this.completedCourses = completedCourse;
        this.registeredCourses = registeredCourse;
        this.plannedCourses = plannedCourses;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCompletedCourses() {
        return completedCourses;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }
    public List<Course> getPlannedCourses() {
        return plannedCourses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setCompletedCourses(List<Course> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
    public void setPlannedCourses(List<Course> plannedCourses) {
        this.plannedCourses = plannedCourses;
    }

    public boolean addToCourse(Course course) {
        boolean missing = false;
        for (Course prereq : course.getPrerequisites()) {
            if (!(completedCourses.contains(prereq))) {
                missing = true;
                break;
            }
        }
        if (missing) {
            System.out.println("One or more prerequisites are not met");
            return false;
        } else {
            System.out.println("Prerequisities are met: course successfully added to builder.");
            plannedCourses.add(course);
            return true;
        }
    }

    // remove from schedule
    // register
    // drop course
    // join waitlist

}