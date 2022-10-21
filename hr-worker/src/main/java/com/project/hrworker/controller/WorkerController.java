package com.project.hrworker.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker;
import com.project.hrworker.domain.entities.Worker1;
import com.project.hrworker.domain.mapper.WorkerMapper;
import com.project.hrworker.services.WorkerService;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerController.class);
//
//	@Value("${test.config}")
//	private String testConfig;

	@Autowired
	private Environment env;

	@Autowired
	private WorkerService workerService;
	
	@Autowired
	private WorkerMapper workerMapper;
	
	
	@GetMapping(value = "/list-all")
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findWorkerById(@PathVariable Long id) {

//		try {
//			Thread.sleep(3000L);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		logger.info("PORT = " + env.getProperty("local.server.port"));
		Worker worker = workerService.findWorkerById(id);
		return new ResponseEntity<>(worker, HttpStatus.OK);

	}

	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
//		logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();

	}
	
	@PostMapping
	public ResponseEntity<String> salvarWorker1(@RequestBody Worker1 worker1) {
		workerService.salvarWorker1(workerMapper.worker1ToWorker1Dto(worker1));
		return new ResponseEntity<>("Salvo com Sucesso", HttpStatus.OK);
	}
	
}
