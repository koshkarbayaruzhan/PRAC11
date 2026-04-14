package university.model.people;

import university.model.academic.Course;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentId;
    private List<Course> courses = new ArrayList<>();

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void viewGrades() {
        System.out.println("Viewing grades...");
    }
}
