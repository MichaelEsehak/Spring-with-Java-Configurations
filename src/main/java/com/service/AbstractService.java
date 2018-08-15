/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.entity.AbstractEntity;

/**
 *
 * @author Michael
 */
public interface AbstractService<T extends AbstractEntity> {

    public Iterable<T> findAll();

    public void save(T u);

    public T findById(Integer id);
    
   //public void findAllById(Integer s);
    public void printAll(String s);

}
