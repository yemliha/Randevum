/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yemliha.randevum.entity;

/**
 *
 * @author istyemlihai
 */
public class Teacher {
    
    private Integer id;
    private String name;
    private String surname;
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
    
}
