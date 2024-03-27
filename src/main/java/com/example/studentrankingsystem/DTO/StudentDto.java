package com.example.studentrankingsystem.DTO;

import com.example.studentrankingsystem.models.Subjects;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class StudentDto {
    private int rollNumber;
    private String name;
    private List<SubjectDTO> subjects;
    private int totalMarks;


}
