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
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
    public Response getStudent(@PathParam("id") int id) {
        DBUtils utils = new DBUtils(); 
        
        try {
            Student st = utils.getStudent(id);
            if (st == null) {
                return Response.status(404).build();
            } else {
                Gson gson = new GsonBuilder().create();
                return Response.status(200).entity(gson.toJson(st)).build();
            }  
        } catch(Exception e) {
            return Response.status(500).build();
        }   
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents() {
         DBUtils utils = new DBUtils(); 
         List<Student> students = utils.getStudents();
         Gson gson = new GsonBuilder().create();
         return Response.status(200).entity(gson.toJson(students)).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(String json) {
        Gson gson = new GsonBuilder().create();
        Student student = gson.fromJson(json, Student.class);
        
        DBUtils utils = new DBUtils(); 
        boolean result = utils.addStudent(student);
        if (result) {
            return Response.status(201).build();
        } else {
            return Response.status(500).build();
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(String json) {
        Gson gson = new GsonBuilder().create();
        Student student = gson.fromJson(json, Student.class);
        
        DBUtils utils = new DBUtils(); 
        boolean result = utils.updateStudent(student);
        if (result) {
            return Response.status(200).build();
        } else {
            return Response.status(500).build();
        }
    }
    
    @DELETE
    @Path("{id}")
    public Response deleteStudent(@PathParam("id") int id) {
        DBUtils utils = new DBUtils(); 
        boolean result = utils.deleteStudent(id);
        if (result) {
            return Response.status(200).build();
        } else {
            return Response.status(500).build();
        }
    }
}
