package com.spring.demo.database;

import com.spring.demo.empmodel.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEid(rs.getInt("eid"));
        employee.setEname(rs.getString("ename"));
        employee.setEdept(rs.getString("edept"));
        return employee;
    }


}