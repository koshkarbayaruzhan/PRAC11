package university.model.additional;

import university.model.academic.Grade;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Grade> grades = new ArrayList<>();

    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}
