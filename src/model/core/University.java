package university.model.core;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String address;
    private List<Faculty> faculties = new ArrayList<>();

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }
}
