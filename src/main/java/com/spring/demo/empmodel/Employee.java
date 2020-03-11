package com.spring.demo.empmodel;


import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Entity;


@Entity
public class Employee {

    private String ename;
    private int eid;
    private String edept;

    public Employee(){
        System.out.println("emp created ------------------------------------------------");
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", eid=" + eid +
                ", edept='" + edept + '\'' +
                '}';
    }
}
