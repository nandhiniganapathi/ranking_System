package com.example.studentrankingsystem.Services;

import com.example.studentrankingsystem.DTO.StudentDto;
import com.example.studentrankingsystem.DTO.SubjectDTO;
import com.example.studentrankingsystem.models.Student;
import com.example.studentrankingsystem.models.Subjects;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentRankingServiceImpl implements StudentRankingService {
    private List<Student> students;

    public StudentRankingServiceImpl() {
        this.students = new ArrayList<>();
        students.add(new Student(101, "John", List.of(
                new Subjects("Math", 100),
                new Subjects("Science", 90),
                new Subjects("Social", 89),
                new Subjects("Tamil", 80),
                new Subjects("Computer Science", 79),
                new Subjects("English", 85)
        )));
        students.add(new Student(102, "Jack", List.of(
                new Subjects("Math", 99),
                new Subjects("Science", 89),
                new Subjects("Social", 89),
                new Subjects("Tamil", 80),
                new Subjects("Computer Science", 79),
                new Subjects("English", 85)
        )));
        students.add(new Student(103, "Kate", List.of(
                new Subjects("Math", 99),
                new Subjects("Science", 89),
                new Subjects("Social", 89),
                new Subjects("Tamil", 80),
                new Subjects("Computer Science", 79),
                new Subjects("English", 85)
        )));
        calculateTotalMarks();
    }

    private void calculateTotalMarks() {
        for (Student student : students) {
            int totalMarks = 0;
            for (Subjects subject : student.getSubjects()) {
                totalMarks += subject.getMark();
            }
            student.setTotalMarks(totalMarks);
        }
    }

    public List<StudentDto> getRankingList() {

        List<StudentDto> studentDtoList = new ArrayList<>();
        for (Student student : students) {
            studentDtoList.add(new StudentDto(student.getRollNumber(), student.getName(), student.getTotalMarks()));
        }
        return studentDtoList;
    }
//        if (this.students == null) {
//            throw new IllegalStateException("Students list is not initialized properly.");
//        }
//        List<StudentDto> rankingList = this.students.stream()
//                .map(student -> {
//                    StudentDto studentDto = new StudentDto();
//                    studentDto.setRollNumber(student.getRollNumber());
//                    studentDto.setName(student.getName());
//
//                    studentDto.setSubjects(student.getSubjects().stream()
//                            .map(subject -> new SubjectDTO(
//                                    subject.getName(),
//                                    subject.getMark()
//                            ))
//                            .collect(Collectors.toList()));
//                    return studentDto;
//                })
//                .sorted(Comparator.comparingInt(StudentDto::getTotalMarks).reversed()) // Descending order by total marks
//                .collect(Collectors.toList());
//
//        return rankingList;
}
