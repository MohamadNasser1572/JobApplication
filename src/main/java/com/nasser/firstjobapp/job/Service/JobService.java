package com.nasser.firstjobapp.job.Service;

import com.nasser.firstjobapp.job.Model.Job;

import java.util.List;

public interface JobService {

    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id,Job job);
}
