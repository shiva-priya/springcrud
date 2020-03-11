package com.spring.demo.empmodel;

import com.spring.demo.database.DBQueries;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class EmployeeService {

    public EmployeeService()
    {
        System.out.println("from emp service-------");
    }

    private List<Employee> employeeList = new CopyOnWriteArrayList<>();
    private int empId = 1;

    DBQueries queries = new DBQueries();

    public int addEmployee(Employee employee)
    {
        return queries.addEmployee(employee);
    }

    public List<Employee> getEmployees()
    {
       return queries.getAllEmployees();
    }

    public int deleteEmployee(long eid)
    {
        return queries.deleteEmployee(eid);
    }

    public int updateEmployee(long eid, String ename, String edept)
    {
        return queries.updateEmployee(eid, ename, edept);
    }



    /*
        public int addEmployee(Employee employee)
    {
        employee.setEid(empId);
        employeeList.add(employee);
        empId++;
        DBQueries queries = new DBQueries();
        int res = queries.addEmployee(employee);
        return res;
    }
     */


}
