/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.entity.Company;
import com.repo.CompanyRepo;
import com.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Michael
 */
@Service("companyService")
public class SimpleCompanyService extends SimpleAbstractService<Company> implements CompanyService {

//    @Autowired
//    private CompanyRepo companyRepo;

    @Override
    public CompanyRepo getRepo() {
        return null;
    }

    
}
