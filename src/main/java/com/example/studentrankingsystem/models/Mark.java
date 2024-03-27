package com.example.studentrankingsystem.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mark extends BaseModel{
    private passMark passMark;
    private int markObtained;
    private Subjects subjects;


}
