package com.example.studentrankingsystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Subjects{

    private String name;
    private int mark;
    public Subjects(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

//
//    private static List<Subjects> createSubjectsList() {
//        List<Subjects> subjects = new ArrayList<>();
//        subjects.add(new Subjects("Math", 100));
//        subjects.add(new Subjects("Science", 90));
//        return subjects;
//    }
}
