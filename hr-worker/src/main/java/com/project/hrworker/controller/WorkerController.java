package com.project.hrworker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrworker.entities.Worker;
import com.project.hrworker.services.WorkerService;

@RestController
@RequestMapping(value= "/workers")
public class WorkerController {
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerController.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping(value = "list-all")
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok(list);
	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findWorkerById(@PathVariable Long id) {
		logger.info("PORT = " + env.getProperty("local.server.port"));
		Worker worker = workerService.findWorkerById(id);
		return new ResponseEntity<>(worker, HttpStatus.OK);
	
	}
	
}
