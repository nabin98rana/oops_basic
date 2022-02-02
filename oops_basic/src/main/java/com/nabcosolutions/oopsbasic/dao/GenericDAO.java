/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nabcosolutions.oopsbasic.dao;

import java.util.List;

/**
 *
 * @author Navin
 */
public interface GenericDAO <T>{
    List<T> getAll();
    int insert(T t);
    T getById(int id);
    int delete(int id);
   
}
