package university.model.people;

import university.model.academic.Course;
import university.model.academic.Grade;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String position;
    private List<Course> courses = new ArrayList<>();

    public void conductLesson() {
        System.out.println("Lesson started");
    }

    public void assignGrade(Grade grade) {
        System.out.println("Grade assigned");
    }
}
