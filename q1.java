import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 public class  Solution {
    public static void main(String args[]) throws Exception {
        int id;
        String name, city, testcity;
        double marks, testmarks;
        // Reading size of Student Array
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the no. of students:");
        int size = s.nextInt();
        Student[] student = new Student[size];
        for (int i = 0; i < student.length; i++) {
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            Scanner s3 = new Scanner(System.in);
            // System.out.println("Enter"+ i+" student"+" details:");
            // System.out.print("student's id:");
            id = s1.nextInt();
            // System.out.print("student's name:");
            name = s2.nextLine();
            // System.out.print("student's city:");
            city=s3.nextLine();
            // System.out.print("student's marks:");
            marks = s1.nextDouble();
            student[i] = new Student(id, city, name, marks);
        }

        Scanner s4 = new Scanner(System.in);
        // System.out.print("testcity:");
        testcity = s4.nextLine();
        // System.out.print("test marks:");
        testmarks = s.nextDouble();
        Student[] temp = getStudentsWithCityAndMarks(student, testcity, testmarks);
        System.out.println(temp.length);
        sortById(temp);
        for (int j = 0; j < temp.length; j++)
            System.out.println(temp[j].id + " " + temp[j].name + " " + temp[j].city + " " + temp[j].marks);

    }

    public static Student[] getStudentsWithCityAndMarks(Student[] students, String city, double marks) {
        int c = 0;
        ArrayList<Student> stdlist = new ArrayList<Student>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].city.equals(city) && students[i].marks == marks) {
                stdlist.add(students[i]);
                c++;
            }
        }
        Student[] stdarray = new Student[stdlist.size()];
        stdlist.toArray(stdarray);
        return stdarray;
    }

    public static Student[] sortById(Student[] std) {
        for (int i = 0; i < std.length; i++) {
            for (int j = i + 1; j < std.length; j++) {
                if (std[i].id > std[j].id) {
                    Student temp = std[i];
                    std[i] = std[j];
                    std[j] = temp;
                }
            }
        }
        return std;
    }

}

class Student {
    int id;
    String city;
    String name;
    double marks;

    Student(int id, String city, String name, double marks) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.marks = marks;
    }

}

