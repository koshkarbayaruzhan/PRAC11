package university.model.academic;

import university.model.core.Department;
import university.model.people.Student;
import university.model.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Department department;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}
