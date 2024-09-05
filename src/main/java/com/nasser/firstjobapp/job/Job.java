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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMidSalary() {
        return midSalary;
    }

    public void setMidSalary(String midSalary) {
        this.midSalary = midSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
