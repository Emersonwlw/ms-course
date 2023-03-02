package com.emersonwlw.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersonwlw.hrworker.entites.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
