package src.advanced.generics.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(11,"Gopal"));
        students.add(new Student(12,"Harsh"));
        students.add(new Student(67,"Lalit"));

        Collections.sort(students);
        System.out.println(students);
    }
}
