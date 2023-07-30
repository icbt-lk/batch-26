/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rest.service.resources;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import db.DBUtils;
import db.Student;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author hnd
 */
@Path("students")
public class StudentResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String getStudent(@PathParam("id") int id) {
        DBUtils utils = new DBUtils(); 
        Student st = utils.getStudent(id);
        Gson gson = new GsonBuilder().create();
        return  gson.toJson(st);
    }
    
    @GET
    public String getStudents() {
         DBUtils utils = new DBUtils(); 
         List<Student> students = utils.getStudents();
         Gson gson = new GsonBuilder().create();
         return  gson.toJson(students);
    }
}
