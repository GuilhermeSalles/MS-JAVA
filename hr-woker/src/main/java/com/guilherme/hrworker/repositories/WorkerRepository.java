package com.guilherme.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
