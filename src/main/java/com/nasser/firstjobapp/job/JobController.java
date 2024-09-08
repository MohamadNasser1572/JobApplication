package com.nasser.firstjobapp.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> findAll() {
        return ResponseEntity.ok(jobService.findAll());
    }


    //POST /jobs: create a new job(request body should contain job details)
    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if (job != null) {
            return ResponseEntity.ok(job);
        }
        return ResponseEntity.notFound().build();
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
