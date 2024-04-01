package com.example.studentrankingsystem.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class Student {
    private int rollNumber;
    private String name;
    private List<Subjects> subjects;
    private int Mark;
    private int totalMarks;

    public Student(int rollNumber, String name, List<Subjects> subjects){
    this.rollNumber = rollNumber;
    this.name = name;
    this.subjects = subjects;


 }
//    public int getTotalMarks() {
////        int totalMarks = subjects.stream()
////                .mapToInt(Subjects::getMark)
////                .peek(mark -> System.out.println("Adding mark: " + mark))
////                .sum();
////        System.out.println("Total marks: " + totalMarks);
////        return totalMarks;
////    }
    public int getTotalMarks() {
        int totalMarks = 0;
        for(Subjects subject :subjects)
            totalMarks += subject.getMark();

        return totalMarks;
    }

    public int getTotalMark() {
        return subjects.stream()
                .mapToInt(Subjects::getMark)
                .sum();
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
