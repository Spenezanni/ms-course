package com.project.hrworker.services;

import java.util.List;

import com.project.hrworker.entities.Worker;

public interface WorkerService {
	
  List<Worker> findAll();
  
  Worker findWorkerBytId(Long id);
	
}
