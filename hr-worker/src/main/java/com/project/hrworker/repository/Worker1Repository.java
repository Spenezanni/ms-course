package com.project.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker1;

@Repository
public interface Worker1Repository extends JpaRepository<Worker1, Long>{

}
