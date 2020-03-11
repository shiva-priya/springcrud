package com.spring.demo.database;

import com.spring.demo.empmodel.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DBQueries {

    SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert((DataSource) SpringJdbcConfig.mysqlDataSource()).withTableName("EMPLOYEE");

    JdbcTemplate jdbcTemplate = new JdbcTemplate(SpringJdbcConfig.mysqlDataSource());

    String insertQuery = "insert into EMPLOYEE(eid,ename,edept) values(?,?,?)";
    String updateQuery = "update EMPLOYEE set ename = ? , edept = ? where eid = ?";
    String deleteQuery = "delete from EMPLOYEE where eid = ?";

    //create
    public int addEmployee(Employee employee)
    {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("eid", employee.getEid());
        parameters.put("ename", employee.getEname());
        parameters.put("edept", employee.getEdept());
        return simpleJdbcInsert.execute(parameters);
    }

    //create with jdbctemplate
    public int addWithTemplate(Employee employee)
    {
        int res = jdbcTemplate.update(insertQuery, new Object[] {employee.getEid(), employee.getEname(), employee.getEdept()});
        return res;
    }

    //retrieve all
    public List<Employee> getAllEmployees()
    {
        List<Employee> actors = jdbcTemplate.query("select * from EMPLOYEE", new EmployeeRowMapper());
        System.out.println(actors);
        return actors;
    }

    //update employee with eid
    public int updateEmployee(long eid, String ename, String edept)
    {
        return jdbcTemplate.update(updateQuery, new Object[] {ename, edept, eid});
    }

    //delete employee with eid
    public int deleteEmployee(long eid)
    {
        return jdbcTemplate.update(deleteQuery, new Object[] {eid});
    }







}
