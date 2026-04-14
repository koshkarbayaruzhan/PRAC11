package university.model.core;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void removeDepartment(Department dept) {
        departments.remove(dept);
    }
}
