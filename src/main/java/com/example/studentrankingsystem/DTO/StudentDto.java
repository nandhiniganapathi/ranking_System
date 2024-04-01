package com.example.studentrankingsystem.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class StudentDto {
    private int rollNumber;
    private String name;
    private List<SubjectDTO> subjects;
    private int TotalMarks;

    public StudentDto(int rollNumber, String name, int TotalMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.TotalMarks = TotalMarks;
    }

//    public int getTotalMarks() {
//        return subjects.stream()
//                .mapToInt(SubjectDTO::getMark)
//                .sum();
//    }
}
