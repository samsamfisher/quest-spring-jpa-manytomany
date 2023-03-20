package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;
import javax.persistence.ManyToMany;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @ManyToMany(mappedBy = "courses")
    private List<Wizard> wizards = new ArrayList<Wizard>();

    public Course() {
    }

    //getter 
    public List<Wizard> getWizard() {
        return wizards;
    }

    // setter
    public void setWizard(List<Wizard> wizard) {
        this.wizards = wizard;
    }

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
