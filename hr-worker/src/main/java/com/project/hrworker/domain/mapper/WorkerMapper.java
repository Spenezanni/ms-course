package com.project.hrworker.domain.mapper;

import org.mapstruct.Mapper;
import com.project.hrworker.domain.dto.Worker1Dto;
import com.project.hrworker.domain.entities.Worker1;


@Mapper(componentModel = "spring")
public interface WorkerMapper {

	Worker1Dto worker1ToWorker1Dto(Worker1 worker1);


}
