package com.spring.demo.context;


import com.spring.demo.empmodel.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.demo.empmodel")
public class BeanConfig {

    @Bean
    public Employee empobj()
    {
        System.out.println("from emp obj --------------");
        return new Employee();
    }

    /*  should be used when the constructor to create object needs some parameter
    @Bean
    public EmployeeService employee()
    {
        System.out.println("from emp service ---------");
        return new EmployeeService();
    }



     */

}
