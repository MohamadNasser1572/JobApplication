package com.nasser.firstjobapp.job;

public class Job {

    //fields every job should have
    private Long id;
    private String title;
    private String description;
    private String midSalary;
    private String maxSalary;
    private String location;

    public Job(Long id, String title, String description, String midSalary, String maxSalary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.midSalary = midSalary;
        this.maxSalary = maxSalary;
        this.location = location;
    }
}
