package com.project.hrworker.workerServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker;
import com.project.hrworker.repository.Worker1Repository;
import com.project.hrworker.repository.WorkerRepository;
import com.project.hrworker.services.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@Autowired
	private Worker1Repository worker1Repository;

	@Override
	public List<Worker> findAll() {
		List<Worker> list = workerRepository.findAll();
		return list;
		
	}

	@Override
	public Worker findWorkerById(Long id) {
		Optional<Worker> worker = workerRepository.findById(id);
		return worker.get();
	}

	@Override
	public void salvarWorker1(Worker1Dto worker1Dto) {
		worker1Repository.save(worker1Dto);
	}

}
