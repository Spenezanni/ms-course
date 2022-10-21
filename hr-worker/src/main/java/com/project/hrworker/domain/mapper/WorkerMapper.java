package com.project.hrworker.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker1;



@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WorkerMapper {

	Worker1Dto worker1ToWorker1Dto(Worker1 worker1);


	
	

}
