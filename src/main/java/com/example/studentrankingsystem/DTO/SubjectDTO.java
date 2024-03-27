package com.example.studentrankingsystem.DTO;

import com.example.studentrankingsystem.models.Subjects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectDTO {
    private String name;
    private int marks;
    public SubjectDTO(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

}
