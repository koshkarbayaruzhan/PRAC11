package university.app;

import university.model.core.*;
import university.model.people.*;
import university.model.academic.*;

public class Main {
    public static void main(String[] args) {

        // Университет
        University uni = new University();

        // Факультет
        Faculty faculty = new Faculty();
        uni.addFaculty(faculty);

        // Кафедра
        Department dept = new Department();
        faculty.addDepartment(dept);

        // Препод
        Teacher teacher = new Teacher();
        dept.addTeacher(teacher);

        // Студент
        Student student = new Student();

        // Курс
        Course course = new Course();
        course.addStudent(student);

        // Экзамен
        Exam exam = new Exam();
        Grade grade = new Grade();

        exam.assignGrade(grade);

        // Пример действий
        student.registerCourse(course);
        teacher.conductLesson();

        System.out.println("Система университета запущена");
    }
}
