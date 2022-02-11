package com.bjpowernode.service.Impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    //引用类型
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int nums =studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> selectStudents() {
        List<Student> students=studentDao.selectStudents();
        return students;
    }
}
