import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class  Solution {
    public static void main(String args[]) throws Exception {
        int id;int size ;
        String name, city, testcity;
        double marks, testmarks;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        if(s1!=null){
                    size = Integer.parseInt(s1);
                     Student[] student = new Student[size];
                     
        for (int i = 0; i < student.length; i++) {
            id = Integer.parseInt(br.readLine());
            name = br.readLine();
            city=  br.readLine();
            marks =Double.parseDouble(br.readLine());
            student[i] = new Student(id, city, name, marks);
        }
        testcity =  br.readLine();
        testmarks = Double.parseDouble(br.readLine());
        Student[] temp = getStudentsWithCityAndMarks(student, testcity, testmarks);
         System.out.println(temp.length);
        sortById(temp);
        for (int j = 0; j < temp.length; j++)
        System.out.println(temp[j].id + " " + temp[j].name + " " + temp[j].city + " " + temp[j].marks);

    }
       
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
                    std[j] = std[i];
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

