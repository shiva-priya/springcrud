package com.spring.demo.empapi;
import com.spring.demo.empmodel.Employee;
import com.spring.demo.empmodel.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
public class EmployeeResource {

    public EmployeeResource() {
        System.out.println("from EmployeeResource -----------------------");
    }

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/get",produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAll()
    {

        return "hi from inside";
    }

    @GetMapping(path = "/allemps")
    public List<Employee> getallEmps()
    {
        return employeeService.getEmployees();
    }

    @PostMapping(path = "/create", consumes = "application/json")
    @ResponseBody
    public int createEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Long> deletePost(@PathVariable Long id) {

        int isRemoved = employeeService.deleteEmployee(id);

        if (isRemoved==0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping(value = "/update/{id}/{ename}/{edept}")
    public ResponseEntity<Long> updateEmployee(@PathVariable Long id, @PathVariable String ename, @PathVariable String edept) {

        int isRemoved = employeeService.updateEmployee(id, ename, edept);

        if (isRemoved==0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
