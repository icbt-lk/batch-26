/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hnd
 */
public class MySQLUtils implements DBUtil {
  
    List<Student> students = new ArrayList<>();

    public MySQLUtils() {
        students.add(new Student("ST01", "John", "1991", "M"));
        
    }
    
    
    
    
    @Override
    public List<Student> getStudents() {
        //Operate with the MySQL DB
        return new ArrayList<>();
    }

    @Override
    public Student getStudent(String stNo) {
        for(Student student : students) {
            if (student.getNo().equals(stNo)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean addStudent(Student st) {
       students.add(st);
       return true;
    }

    @Override
    public boolean updateStudent(Student st) {
        int index = 0;
        
        for(Student student : students) {
            if (student.getNo().equals(st.getNo())) {
                index = students.indexOf(student);
                break;
            }
        }
        students.remove(index);
        students.add(st);
        return true;
    }

    @Override
    public boolean deleteStudent(String stNo) {
        int index = 0;
        for(Student student : students) {
            if (student.getNo().equals(stNo)) {
                index = students.indexOf(student);
                break;
            }
        }
        students.remove(index);
        return true;
    }
}
