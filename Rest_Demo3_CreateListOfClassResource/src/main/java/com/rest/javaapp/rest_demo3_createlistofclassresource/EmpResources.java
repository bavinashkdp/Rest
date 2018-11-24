/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.javaapp.rest_demo3_createlistofclassresource;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 *
 * @author user
 */
@Path("employeeResources")
public class EmpResources
{
    @GET 
    @Produces(MediaType.APPLICATION_XML)
   public List<Employee> getEmployee()
    {
        System.out.println("in side get employee!!!!!!!!!!!!!!!!!!!!!");
    Employee e=new  Employee();
    e.setEmpId(20);
    e.setEmpName("hari");
    e.setSalary(40000);
    Employee e1=new  Employee();
    e1.setEmpId(30);
    e1.setEmpName("krishna");
    e1.setSalary(50000);
        List<Employee> employees=new ArrayList<>();
        employees.add(e);
        employees.add(e1);
        return employees;
    }
    
    
}
