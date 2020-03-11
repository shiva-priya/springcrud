package com.spring.demo;

import com.spring.demo.database.DBQueries;
import com.spring.demo.empmodel.Employee;
import com.spring.demo.empmodel.EmployeeService;

import java.util.List;

public class Main {

    public static void main(String args[])
    {
        EmployeeService employeeService = new EmployeeService();
        DBQueries dbQueries = new DBQueries();
        Employee e = new Employee();
        e.setEdept("it");
        e.setEname("meena");
        e.setEid(1);

      /*  int k = employeeService.addEmployee(e);
        System.out.println(k + " after insertion");
        List<Employee> elist =  employeeService.getEmployees();
        System.out.println(elist);

        int r = dbQueries.addWithTemplate(e);
        System.out.println(r + "from template");

       */

        System.out.println(dbQueries.updateEmployee(2,"reema","opst"));
        //System.out.println(dbQueries.deleteEmployee(1));
    }
}
