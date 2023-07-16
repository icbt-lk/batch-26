/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.app;

import java.util.List;

/**
 *
 * @author hnd
 */
public interface DBUtil {
    public List<Student> getStudents();
    
    public Student getStudent(String stNo);
    
    public boolean addStudent(Student st);
    
    public boolean updateStudent(Student st);
    
    public boolean deleteStudent(String stNo);
}
