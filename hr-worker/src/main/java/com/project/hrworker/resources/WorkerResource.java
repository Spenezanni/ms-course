package com.project.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrworker.entities.Worker;
import com.project.hrworker.services.WorkerService;

@RestController
@RequestMapping(value= "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping("list-all")
	public ResponseEntity<List<Worker>> findAll(){
		
		List<Worker> list = workerService.findAll();
	
	return ResponseEntity.ok(list);
	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Worker> findWorker(@PathVariable Long id){
		
	 Worker worker = workerService.findWorkerBytId(id);
	
	return ResponseEntity.ok(worker);
	
	}
}
