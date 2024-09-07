package com.nasser.firstjobapp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }


    //POST /jobs: create a new job(request body should contain job details)
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Job created successfully.";
    }
}

/*
 * GET /jobs: Get all jobs
 * GET /jobs/{id}: Get a specific job by ID
 * POST /jobs: create a new job(request body should contain job details)
 * DELETE /jobs/{id} delete a specific job by id
 * PUT /jobs/{id}: update a specific job by ID (request body should contain the updated job details)
 * GET /jobs/{id}/company: Get the company associated with a specific job by ID

 * Example API URLs:
 * GET {base_url}/jobs
 * GET {base_url}/jobs/1
 * POST {base_url}/jobs
 * DELETE {base_url}/jobs/1
 * PUT {base_url}/jobs/1
 *



 */
