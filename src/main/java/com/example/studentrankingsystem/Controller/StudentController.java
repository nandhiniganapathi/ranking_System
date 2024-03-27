package com.example.studentrankingsystem.Controller;

import com.example.studentrankingsystem.DTO.StudentDto;
import com.example.studentrankingsystem.Services.StudentRankingService;
import com.example.studentrankingsystem.Services.StudentRankingServiceImpl;

import java.util.List;

public class StudentController {
    private final StudentRankingService studentRankingService;

    public StudentController() {
        this.studentRankingService = new StudentRankingServiceImpl();
    }

    public List<StudentDto> getRankingList() {
        return studentRankingService.getRankingList();
    }
}
