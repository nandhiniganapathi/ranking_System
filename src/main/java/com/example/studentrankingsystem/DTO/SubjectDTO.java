package com.example.studentrankingsystem.DTO;


import lombok.Getter;
import lombok.Setter;


public class SubjectDTO {
    private String name;
    private int mark;

    public SubjectDTO(String name, int mark) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int marks) {
        this.mark = marks;
    }
}
