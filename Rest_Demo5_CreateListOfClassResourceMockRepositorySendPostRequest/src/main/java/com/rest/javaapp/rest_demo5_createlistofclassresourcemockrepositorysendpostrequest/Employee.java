
package com.rest.javaapp.rest_demo5_createlistofclassresourcemockrepositorysendpostrequest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee 
{
    private int empId;
    private String empName;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", salary=" + salary + '}';
    }
    
    
}
