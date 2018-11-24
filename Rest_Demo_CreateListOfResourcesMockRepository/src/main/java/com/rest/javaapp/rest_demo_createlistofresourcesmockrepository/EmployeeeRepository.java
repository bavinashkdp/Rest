/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.javaapp.rest_demo_createlistofresourcesmockrepository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */

public class EmployeeeRepository 
{
    List<Employee>employees;

    public EmployeeeRepository() 
    {
        employees=new ArrayList<>();
        Employee employee=new Employee();
        employee.setEmpId(20);
        employee.setEmpName("siri");
        employee.setSalary(60000);
        
        Employee employee2=new Employee();
        employee2.setEmpId(50);
        employee2.setEmpName("lucky");
        employee2.setSalary(30000);
         employees.add(employee);
        employees.add(employee2);
    }
    public List<Employee> getEmployees()
    {
         System.out.println("get employee method is called in employee repository");
    return employees;
    }
    public Employee getEmployeeById(int id)
    {
    for(Employee employee:employees)
    {
    if(employee.getEmpId()==id)
    {
    return employee;
    }
    }
    return null;
  }
   
    
    
}
