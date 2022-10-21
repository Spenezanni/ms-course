package com.project.hrworker.services;

import java.util.List;

import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker;

public interface WorkerService {
	
  List<Worker> findAll();
  
  Worker findWorkerById(Long id);

  void salvarWorker1(Worker1Dto worker1Dto);
	
}
