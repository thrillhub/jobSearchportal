package com.jobportal.Job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jobportal.Job.Project")
@EntityScan("com.jobportal.Job.Project.entity")
@EnableJpaRepositories("com.jobportal.Job.Project.repository") 
public class JobSearchPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobSearchPortalApplication.class, args);
    }

}
