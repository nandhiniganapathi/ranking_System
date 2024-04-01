package com.example.studentrankingsystem.Controller;

import com.example.studentrankingsystem.DTO.StudentDto;
import com.example.studentrankingsystem.Services.StudentRankingService;
import com.example.studentrankingsystem.Services.StudentRankingServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StudentController {
    private final StudentRankingServiceImpl studentRankingService;

    public StudentController(StudentRankingServiceImpl studentService) {
        this.studentRankingService = studentService;
    }

    public List<StudentDto> getRankingList() {
        return studentRankingService.getRankingList();
    }
}
