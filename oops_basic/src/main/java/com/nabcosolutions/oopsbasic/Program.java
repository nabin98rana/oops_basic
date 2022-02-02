/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabcosolutions.oopsbasic;

import com.nabcosolutions.oopsbasic.dao.EmployeeDAO;
import com.nabcosolutions.oopsbasic.dao.impl.EmployeeDAOImpl;
import com.nabcosolutions.oopsbasic.entity.Employee;
import com.nabcosolutions.oopsbasic.view.EmployeeView;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Navin
 */
public class Program {
     public static void menu(){
        
         //Employee Menu
        System.out.println("1. Add Employee");
        System.out.println("2. Show all Employees");
        System.out.println("3. Exit");
        System.out.println("Enter your choice [1-3]:");
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        EmployeeDAO employeeDAO=new EmployeeDAOImpl();
        EmployeeView ev=new EmployeeView(new Scanner(System.in), employeeDAO);
        
        while(true){
            menu(); 
            ev.controller();
        }
    }
}
