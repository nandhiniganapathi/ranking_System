package com.example.studentrankingsystem.models;

import lombok.Getter;
import lombok.Setter;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {
    private int rollNumber;
    private String name;
    private List<Subjects> subjects;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    public Student(int rollNumber, String name, List<Subjects> subjects){
this.rollNumber = rollNumber;
    this.name = name;
    this.subjects = subjects;

 }
    public int getTotalMarks() {
        int totalMarks = 0;
        for(Subjects subject :subjects)
            totalMarks += subject.getMark();

        return totalMarks;
    }


//    private void validate(){
//        validateRollNumber();
//        //valicate the list of subjects not more then 6
//    }
//
//    private boolean validateRollNumber(List<Student> student, int rollNumber){
//        for(Student st : student){
//            if(st.getRollNumber()==rollNumber){
//                return true;// if there is a duplicate
//            }
//        }
//        return false;
//    }
}
