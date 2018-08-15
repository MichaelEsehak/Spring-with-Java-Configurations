/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.entity.User;
import java.util.Optional;

/**
 *
 * @author Michael
 */

public interface UserService extends AbstractService<User> {
   
    public void printmmm();

    public Optional<User> loadByUsername(String username);

}
