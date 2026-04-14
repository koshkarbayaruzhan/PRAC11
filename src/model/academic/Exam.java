package university.model.academic;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private Course course;
    private String date;
    private List<Grade> grades = new ArrayList<>();

    public void scheduleExam() {}

    public void assignGrade(Grade grade) {
        grades.add(grade);
    }
}
