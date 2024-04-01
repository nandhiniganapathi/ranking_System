package com.example.studentrankingsystem.models;


public class Subjects{

    private String name;

    private int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Subjects(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

}
