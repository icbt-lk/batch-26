/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author hnd
 */
public class Student {
    private int id;
    private String name;
    private String dob;

    public Student() {
        this.id = -1;
        this.name = "";
        this.dob = "";
    }

    public Student(int id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
}
