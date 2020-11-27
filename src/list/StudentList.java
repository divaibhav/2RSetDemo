/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Nov-20
 *  Time: 5:37 PM
 */
package list;

import databean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**Question: Create a list of Student object, add 5 elements in the list.
        * Sort the list

 */
public class StudentList {
    public static void main(String[] args) {
        //creating a list
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("Ramesh");
        Student s2 = new Student();
        s2.setRollNo(12);
        s2.setName("Vikas");
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");

        //adding these object in list
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);

        //sorting this list
        //by using collections class
        Collections.sort(studentList);//student class must inherit Comparable interface
        //by using list sort method
        //lambda for comparator
        Comparator<Student> comparator = (o1, o2) -> {
          return o1.getRollNo() - o2.getRollNo();
        };
        studentList.sort(comparator);//student must inherit Comparator interface
        System.out.println(studentList);
    }
}
/**
 * Question: Create a list of Student object, add 5 elements in the list.
 * Sort it on the basis of first on rollNo,
 * then sort the list by Name;
 * Student class contains two fields rollNo & Name;
 * hint: Comparable<T></> and Comparator<T> with lambda expression
 */