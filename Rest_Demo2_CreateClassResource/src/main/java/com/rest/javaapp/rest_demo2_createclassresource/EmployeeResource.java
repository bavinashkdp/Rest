package com.rest.javaapp.rest_demo2_createclassresource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("employees")
public class EmployeeResource 
{
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Employee getEmployee() 
    {
        System.out.println("get employee is called");
        Employee e=new Employee();
        e.setEmpId(12);
        e.setEmpName("hari");
        e.setSalary(30000);
       return e;
    }
    
}
