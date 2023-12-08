import com.irinadenman.demo.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student(1, "Caleb", 3.6, "jdtg0@aws.com", "Female"));
        studentList.add(new Student(2, "Aida", 3.1, "adattt@test.gov", "Female"));
        studentList.add(new Student(3, "Alex", 3.4, "Adavis@bccs.com", "Male"));
        studentList.add(new Student(4, "Meba", 3.2, "mtravis@yahoo.com", "Male"));


        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}