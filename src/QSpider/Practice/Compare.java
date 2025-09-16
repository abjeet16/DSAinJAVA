package QSpider.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student other){
        return this.id - other.id;
    }

    public String toString(){
        return "id :"+id+" name : "+name+" ";
    }
}
class NameComparator implements Comparator<Student>{
    public int compare(Student s1 , Student s2){
        return s1.name.compareTo(s2.name);
    }
}
public class Compare {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,"ravi"));
        students.add(new Student(4,"abjeet"));
        students.add(new Student(1,"rahul"));
        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students,new NameComparator());
        System.out.println(students);
    }
}
