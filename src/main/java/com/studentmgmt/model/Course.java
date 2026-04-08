package com.studentmgmt.model;

import java.util.Objects;

public class Course {
    private String id;
    private String courseName;
    private String courseCode;
    private String instructor;
    private int credits;

    public Course(String id, String courseName, String courseCode, String instructor, int credits) {
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return credits == course.credits && Objects.equals(id, course.id) && Objects.equals(courseName, course.courseName) && Objects.equals(courseCode, course.courseCode) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, courseCode, instructor, credits);
    }

    @Override
    public String toString() {
        return "Course{" + "id='" + id + '\'' + ", courseName='" + courseName + '\'' + ", courseCode='" + courseCode + '\'' + ", instructor='" + instructor + '\'' + ", credits=" + credits + '}';
    }
}