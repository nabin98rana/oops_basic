/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nabcosolutions.oopsbasic.view;

import com.nabcosolutions.oopsbasic.dao.EmployeeDAO;
import com.nabcosolutions.oopsbasic.entity.Employee;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EmployeeView {
    
    private Scanner input;
    private EmployeeDAO employeeDAO;

    public EmployeeView(Scanner input, EmployeeDAO employeeDAO) {
        this.input = input;
        this.employeeDAO = employeeDAO;
    }
    
    public void add() throws ClassNotFoundException, SQLException{
                while(true){
                
                //user input     
                Employee e =new Employee();
                System.out.println("Enter Id:");
                e.setId(input.nextInt());
                System.out.println("Enter FirstName:");
                e.setFirstName(input.next());
                System.out.println("Enter LastName:");
                e.setLastName(input.next());
                System.out.println("Enter Email:");
                e.setEmail(input.next());
                System.out.println("Enter Contact No:");
                e.setContactNo(input.next());
                System.out.println("Enter Status:");
                e.setStatus(input.nextBoolean());
                
                employeeDAO.insert(e);
                    System.out.println("Do you want to add more [Y/N]:");
                    if(input.next().equalsIgnoreCase("n")){
                     break;
                    }
                }
    }
    //show all employee
    public void showAll() throws ClassNotFoundException, SQLException{
     employeeDAO.getAll().forEach(eq->{
                    System.out.println(eq.toString());
                });
    }
     
    //controller to add/show and exit the employee menu
    public void controller() throws ClassNotFoundException, SQLException{
    switch(input.nextInt()){
            case 1:
                add();
                break;
            case 2:
                showAll();
                break;
            
            default:
                System.exit(0);
                break;
         }
    }
}
