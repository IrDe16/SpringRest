package com.irinadenman.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public StudentService() {

        students.add(new Student(1, "Caleb", 3.6, "jdtg0@aws.com", "Female"));
        students.add(new Student(2, "Aida", 3.1, "adattt@test.gov", "Female"));
        students.add(new Student(3, "Alex", 3.4, "Adavis@bccs.com", "Male"));
        students.add(new Student(4, "Meba", 3.2, "mtravis@yahoo.com", "Male"));
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> searchByName(String name) {
        return students.stream()
                .filter(student -> student.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Student> searchByGpa(double gpa) {
        return students.stream()
                .filter(student -> student.getGpa() == gpa)
                .collect(Collectors.toList());
    }

    public double getAverageGpaByName(String name) {
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if (filteredStudents.isEmpty()) {
            return 0.0;
        }

        double totalGpa = filteredStudents.stream()
                .mapToDouble(Student::getGpa)
                .sum();

        return totalGpa / filteredStudents.size();
    }
}