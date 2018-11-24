
package com.rest.javaapp.rest_demo5_createlistofclassresourcemockrepositorysendpostrequest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("emps")
public class EmployeeResource 
{
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Employee getEmployee()
    {
       return null;
    }
    
    
}
