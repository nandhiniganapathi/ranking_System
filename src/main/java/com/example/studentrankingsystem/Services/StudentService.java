package com.example.studentrankingsystem.Services;

import com.example.studentrankingsystem.DTO.StudentDto;

public interface StudentService {
    StudentDto getStudentById(Long id);
    StudentDto addStudent(StudentDto studentDto);

}
