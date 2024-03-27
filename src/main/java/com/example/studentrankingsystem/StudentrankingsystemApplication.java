package com.example.studentrankingsystem;
import com.example.studentrankingsystem.Controller.StudentController;
import com.example.studentrankingsystem.DTO.StudentDto;
import com.example.studentrankingsystem.models.Student;
import com.example.studentrankingsystem.models.Subjects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudentrankingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentrankingsystemApplication.class, args);
        StudentController studentController = new StudentController();
        List<StudentDto> studentList = studentController.getRankingList();

        System.out.println("Rank List of Students:");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-10s %-15s %-10s\n", "Rank", "Roll No.", "Name", "Total Marks");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < studentList.size(); i++) {
            StudentDto studentDto = studentList.get(i);
            System.out.println("Rank " + (i + 1) + ":");
            System.out.println("ID: " + studentDto.getRollNumber());
            System.out.println("Name: " + studentDto.getName());
            System.out.println("Subjects:");
            for (int j = 0; j < studentDto.getSubjects().size(); j++) {
                System.out.println("Subject " + (j + 1) + ": " + studentDto.getSubjects().get(j).getName() +
                        " - Marks: " + studentDto.getSubjects().get(j).getMarks());
            }
            System.out.println();
        }
    }
}
