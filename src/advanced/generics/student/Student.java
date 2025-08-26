package src.advanced.generics.student;

class Student implements Comparable<Student>{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString(){
        return rollNo + "-" + name;
    }
}
