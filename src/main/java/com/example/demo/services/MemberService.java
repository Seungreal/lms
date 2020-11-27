package com.example.demo.services;

import java.util.List;

import com.example.demo.domains.StudentDTO;
import com.example.demo.domains.TeacherDTO;

import org.springframework.stereotype.Component;
@Component
public interface MemberService {
    public void registStudent(StudentDTO s);
    public void updateStudent(StudentDTO s);
    public void deleteSrudent(StudentDTO s);
    public void registTeacher(TeacherDTO t);
    public List<StudentDTO> printStudentList();
    public StudentDTO printStudentDetail(int memId);
    public int sum(StudentDTO s);
    public double avg(int sum);
    public StudentDTO login(StudentDTO s);
    public TeacherDTO access(TeacherDTO t);
    public boolean existId(String memName);
}
