/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repo;

import com.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Michael
 * @param <T>
 */
@NoRepositoryBean

public interface AbstractRepo<T extends AbstractEntity> extends JpaRepository<T, Integer> {

    public void printAll(String s);

}
