package com.example.studentrankingsystem.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rank extends BaseModel{
   private Student student;
   private int total;
   private int rankNumber;

}
