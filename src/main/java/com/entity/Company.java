/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Michael
 */
@Entity
@Table(name = "company")
public class Company extends AbstractEntity {

    @Column

    private String name;

    
    @OneToMany(mappedBy = "company",fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private List<User> users;

    public Company() {
    }
    
    public List<User> getUsers(){
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
