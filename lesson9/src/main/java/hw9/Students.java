package hw9;

import java.util.List;

public class Students {
    private String name;
    private List<Courses> coursesList;

    public Students(String name, List<Courses> coursesList) {
        this.name = name;
        this.coursesList = coursesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", coursesList=" + coursesList +
                '}';
    }
}
