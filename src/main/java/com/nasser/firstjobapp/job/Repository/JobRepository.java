package com.nasser.firstjobapp.job.Repository;

import com.nasser.firstjobapp.job.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job, Long> {
}
