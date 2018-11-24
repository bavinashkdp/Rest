/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.javaapp.rest_demo_createlistofresourcesmockrepository;
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
@Path("emp")
public class EmployeeResource 
{
    EmployeeeRepository employeeeRepository=new EmployeeeRepository();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Employee> getEmployees()
    {
        System.out.println("get employee method is called in employee resource");
//        Employee employee=new Employee();
//        employee.setEmpId(20);
//        employee.setEmpName("siri");
//        employee.setSalary(60000);
//        
//        Employee employee2=new Employee();
//        employee2.setEmpId(50);
//        employee2.setEmpName("lucky");
//        employee2.setSalary(30000);
//        
//        List<Employee>employees=new ArrayList<Employee>();
//        employees.add(employee);
//        employees.add(employee2);
//        
        return employeeeRepository.getEmployees();
    }
  
    
}
