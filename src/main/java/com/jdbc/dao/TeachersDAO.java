package com.jdbc.dao;

import com.jdbc.model.Teacher;

public interface TeachersDAO {

    void addTeacher(Teacher teacher);
    Teacher getTeacherById(Integer id);
    void saveTeacher(Teacher teacher);


}
