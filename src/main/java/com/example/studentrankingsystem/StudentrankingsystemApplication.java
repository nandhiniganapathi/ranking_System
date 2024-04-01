package com.example.studentrankingsystem;
import com.example.studentrankingsystem.Controller.StudentController;
import com.example.studentrankingsystem.DTO.StudentDto;
import com.example.studentrankingsystem.Services.StudentRankingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;

@SpringBootApplication
public class StudentrankingsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentrankingsystemApplication.class, args);
//        StudentController studentController =  new StudentController();
//        List<StudentDto> studentList = studentController.getRankingList();
        // Assuming you have an instance of StudentRankingServiceImpl available here
        StudentRankingServiceImpl studentService = new StudentRankingServiceImpl();

        // Constructing StudentController with the instance of StudentRankingServiceImpl
        StudentController studentController = new StudentController(studentService);
        // Now you can call methods on StudentController
        List<StudentDto> studentList = studentController.getRankingList();

        System.out.println("Rank List of Students:");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-10s %-15s %-10s\n", "Rank", "Roll No.", "Name", "Total Marks");
        System.out.println("--------------------------------------------------------");
        int rank = 1;
        int previousMarks = Integer.MAX_VALUE;
        for (int i = 0; i < studentList.size(); i++) {
            StudentDto studentDto = studentList.get(i);
            int currentMarks =  studentDto.getTotalMarks();
            if (currentMarks != previousMarks) {
                rank = i + 1;
            }
            System.out.printf("%-10s %-10s %-15s %-10s\n", rank, studentDto.getRollNumber(), studentDto.getName(), studentDto.getTotalMarks());
            previousMarks = currentMarks;
        }
        System.out.println("--------------------------------------------------------");
    }
}
