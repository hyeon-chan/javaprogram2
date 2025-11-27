package week13_2;

import java.util.*;

class Student implements Comparable<Student> {
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public String toString() { return name; }

    public int compareTo(Student s) {
        return s.number - number;
    }
}
