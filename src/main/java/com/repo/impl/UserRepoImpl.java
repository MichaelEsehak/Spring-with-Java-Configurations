/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repo.impl;

import com.repo.UserRepoCustom;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Michael
 */
@Transactional
public class UserRepoImpl implements UserRepoCustom {

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public void printmmm() {
        System.out.println("michael ayed");
    }
}
