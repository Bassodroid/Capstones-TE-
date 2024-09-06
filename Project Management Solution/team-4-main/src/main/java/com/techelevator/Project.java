package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private String startDate;
    private String dueDate;
    List<Employee> teamMembers = new ArrayList<>();
    public Project(String name,String description, String startDate, String dueDate){

        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }


}
