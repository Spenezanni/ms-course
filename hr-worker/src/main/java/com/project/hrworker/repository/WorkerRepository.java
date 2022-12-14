package com.project.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

	void save(Worker1Dto worker1Dto);

}
