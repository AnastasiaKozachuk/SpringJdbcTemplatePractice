package com.jdbc;

import com.jdbc.dao.WorkWithStudents;
import com.jdbc.dao.WorkWithTeacher;
import com.jdbc.model.Student;
import com.jdbc.model.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      /*  WorkWithStudents workWithStudents = context.getBean("worker", WorkWithStudents.class);

        Student student = new Student("Anton", 4);

        workWithStudents.saveStudentToDb(student);
        System.out.println(workWithStudents.getStudentById(2));*/
        WorkWithTeacher workWithTeacher = context.getBean("teachersWorker", WorkWithTeacher.class);

        Teacher teacher = new Teacher();
        teacher.setFirstName("Igor");
        teacher.setLastName("Dehhen");
        teacher.setCellPhone("0348394344");
        workWithTeacher.addTeacher(teacher);
        System.out.println(workWithTeacher.getTeacherById(4));
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTacher(teacher);
        System.out.println(workWithTeacher.getTeacherById(4));


        context.close();


    }

}
