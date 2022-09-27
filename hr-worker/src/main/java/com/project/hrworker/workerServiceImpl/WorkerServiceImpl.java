package com.project.hrworker.workerServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrworker.entities.Worker;
import com.project.hrworker.repository.WorkerRepository;
import com.project.hrworker.services.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public List<Worker> findAll() {
		List<Worker> list = workerRepository.findAll();
		return list;
		
	}

	@Override
	public Worker findWorkerBytId(Long id) {
		Optional<Worker> worker = workerRepository.findById(id);
		return worker.get();
	}

}