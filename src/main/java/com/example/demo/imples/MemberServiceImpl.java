package com.example.demo.imples;

import java.util.List;

import com.example.demo.domains.StudentDTO;
import com.example.demo.domains.TeacherDTO;
import com.example.demo.services.MemberService;

import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public void registStudent(StudentDTO s) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateStudent(StudentDTO s) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteSrudent(StudentDTO s) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registTeacher(TeacherDTO t) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<StudentDTO> printStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentDTO printStudentDetail(int memId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sum(StudentDTO s) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public StudentDTO login(StudentDTO s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TeacherDTO access(TeacherDTO t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existId(String memName) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
