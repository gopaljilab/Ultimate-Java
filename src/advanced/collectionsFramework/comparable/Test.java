package src.advanced.collectionsFramework.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2,"Alex Mercer"));
        studentList.add(new Student(1,"John Wick"));
        studentList.add(new Student(3,"Pitter Carlos"));

        Collections.sort(studentList);
        for (Student student : studentList ){
            System.out.println(student.rollNo + " " + student.name);
        }
    }
}
