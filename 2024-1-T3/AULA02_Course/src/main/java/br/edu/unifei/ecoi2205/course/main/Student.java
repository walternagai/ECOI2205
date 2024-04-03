package br.edu.unifei.ecoi2205.course.main;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    public static class StudentBuilder extends Person {
        private double totalIndex;
        public StudentBuilder(String CPF, String name) {
            super(CPF, name);
            this.totalIndex = 0;
        }
        public StudentBuilder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public StudentBuilder totalIndex(double totalIndex) {
            this.totalIndex = totalIndex;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
    private double totalIndex;
    private List<Course> courseList = new ArrayList<>();
    private Student(StudentBuilder studentBuilder) {
        super(studentBuilder.getCPF(),
                studentBuilder.getName());
        this.birthDate = studentBuilder.getBirthDate();
        this.totalIndex = studentBuilder.totalIndex;
    }
    public List<Course> getCourseList() {
        return courseList;
    }
    public void addCourse(Course course) {
        courseList.add(course);
    }
    public double getTotalIndex() {
        return this.totalIndex;
    }
}
