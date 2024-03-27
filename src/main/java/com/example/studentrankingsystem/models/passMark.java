package com.example.studentrankingsystem.models;

public enum passMark {
    PASS(35),
    FAIL(0),
    DISTINCTION(80);

    private final int mark;

    passMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public static passMark fromMark(int mark){
        if(mark>= DISTINCTION.mark){
            return DISTINCTION;
        }
        else if(mark>= PASS.mark){
            return PASS;
        }
        else{
            return FAIL;
        }
    }
}
