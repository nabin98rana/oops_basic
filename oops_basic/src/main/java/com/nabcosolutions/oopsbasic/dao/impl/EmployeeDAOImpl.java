/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabcosolutions.oopsbasic.dao.impl;

import com.nabcosolutions.oopsbasic.dao.EmployeeDAO;
import com.nabcosolutions.oopsbasic.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navin
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    private List<Employee> empList;
    
    public EmployeeDAOImpl() {
       empList = new ArrayList<>();
    }

    public EmployeeDAOImpl(List<Employee> empList) {
        this.empList = empList;
    }

     
    @Override
    public List<Employee> getAll() {
        return empList;
    }

    @Override
    public int insert(Employee t) {
        empList.add(t);
        return 1;
    }

    @Override
    public Employee getById(int id) {
         for(Employee t: empList){
        if(t.getId()==id){
            
            return t;
        } 
       }
        return null;
    }

    
    @Override
    public int delete(int id) {
       for(Employee t: empList){
        if(t.getId()==id){
            empList.remove(t);
            return 1;
        }
       }
       return 0;
    }
}
