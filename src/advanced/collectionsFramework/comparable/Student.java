package src.advanced.collectionsFramework.comparable;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }
}
