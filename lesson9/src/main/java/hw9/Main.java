package hw9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Courses> coursesList = new ArrayList<>();
//        coursesList.add(new Courses("Java"));
//        coursesList.add(new Courses("Biology"));
//        coursesList.add(new Courses("Database"));
//        coursesList.add(new Courses("Math"));
        List<Students> studensList = new ArrayList<>();
        studensList.add(new Students("Ainura", Arrays.asList(new Courses("Java"), new Courses("Math"), new Courses("Databse"), new Courses("Biology"))));
        studensList.add(new Students("Adlet", Arrays.asList(new Courses("Java"), new Courses("Math"))));
        studensList.add(new Students("Erdos", Arrays.asList( new Courses("Math"))));
        studensList.add(new Students("Zhandos", Arrays.asList(new Courses("Java"), new Courses("Math"), new Courses("Biology"))));
        studensList.add(new Students("Rauan", Arrays.asList(new Courses("Biology"))));
        System.out.println(studensList.stream()
                        .map(s -> s.getCoursesList())
                        .flatMap(c -> c.stream())
                        .map(c -> c.getName())
                        .distinct()
                        .collect(Collectors.toSet()));
        System.out.println(studensList.stream()
                .sorted((s, s2) -> s2.getCoursesList().size() - s.getCoursesList().size())
                        .limit(3)
                .collect(Collectors.toList())


        );
        Courses course = new Courses("Java");
        System.out.println(studensList.stream()
                        .filter(p -> p.getCoursesList().contains(course))

                .collect(Collectors.toList())
        );


    }
}
