package com.alshawi.home.service;

import com.alshawi.home.nodes.Student;
import com.alshawi.home.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("studentService")
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void create(Student s)
    {
        studentRepository.save(s);
    }
    public Long size()
    {
        return studentRepository.count();
    }
    public Student ById(Integer id)
    {
        return studentRepository.getStudentFromId(id);
    }
    public Collection<Student> ByMajor(String m)
    {
        return studentRepository.getStudentByMajor(m);
    }
    public Collection<Student> ByUniversity(String u)
    {
        return studentRepository.getStudentByUniversity(u);
    }
    public Iterable<Student> getAll()
    {
        return studentRepository.findAll();
    }
}
