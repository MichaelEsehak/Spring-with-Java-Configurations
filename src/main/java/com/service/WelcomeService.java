/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Michael
 */
@Service
public class WelcomeService {

    public String getName(String key) {
        return "welcome" + " " + key;
    }
}
