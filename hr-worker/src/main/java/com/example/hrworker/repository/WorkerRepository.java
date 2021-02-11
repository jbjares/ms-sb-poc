package com.example.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrworker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
