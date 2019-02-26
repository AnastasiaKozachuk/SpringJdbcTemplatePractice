package com.jdbc.dao;

import com.jdbc.model.Student;

public interface StudentsDAO {

    void adStudent(Student student);

    Student getStudentById(Integer id);
}
