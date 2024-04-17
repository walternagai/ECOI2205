package br.edu.unifei.ecoi2205.course.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        courseList.add(
                new Course.CourseBuilder("ECO030",
                        "Programação Orientada a Objetos")
                        .totalHours(64)
                        .build());
        courseList.add(
                new Course.CourseBuilder("ECO044.1",
                        "Programação de Dispositivos Móveis")
                        .totalHours(16)
                        .build());
        courseList.add(
                new Course.CourseBuilder("ECO044.2",
                        "Programação de Dispositivos Móveis")
                        .totalHours(48)
                        .build());
        List<Person> people = new ArrayList<>();
        Student john_doe = new Student.StudentBuilder("111.111.111-11",
                "John Doe")
                .birthDate("12/12/2012")
                .totalIndex(10.0)
                .build();
        john_doe.addCourse(courseList.get(0));
        Student jane_doe = new Student.StudentBuilder("222.222.222-22",
                "Jane Doe")
                .birthDate("11/11/2011")
                .totalIndex(9)
                .build();
        jane_doe.addCourse(courseList.get(1));
        jane_doe.addCourse(courseList.get(2));
        Teacher alan_turing = new Teacher.TeacherBuilder("999.999.999-99",
                "Alan Turing")
                .salary(1000000)
                .build();
        alan_turing.addCourse(courseList.get(0));
        alan_turing.addCourse(courseList.get(1));
        people.add(john_doe);
        people.add(jane_doe);
        people.add(alan_turing);
        for (Person p : people) {
            System.out.println(p.toString());
            if (p instanceof Student) {
                Student student = (Student) p;
                for (Course c : student.getCourseList()) {
                    System.out.println(c.toString());
                }
                System.out.println("index:\t" + student.getTotalIndex());
            }
            else if(p instanceof Teacher) {
                Teacher teacher = (Teacher) p;
                for (Course c : teacher.getCourseList()) System.out.println(c.toString());
                System.out.println("total hours:\t" + teacher.getTotalHoursCourses());
            }
        }
    }
}
