package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TodoEntity;
import com.example.demo.persistence.TodoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodoService {	
	
	@Autowired
	private TodoRepository repository;
	
	public String testService() {
		//Todo entity 생성
		TodoEntity entity =TodoEntity.builder().title("MyFirstTodoItem!!!!!!!").done(true).build();
		
		//TodoEntity 저장
		repository.save(entity);
		
		//TodoEntity 검색
		TodoEntity saveEntity = repository.findById(entity.getId()).get();
		
		
		
		return saveEntity.getTitle();
	}
	
	public List<TodoEntity> create(final TodoEntity entity){
		validate(entity);
		
		repository.save(entity);
		
		log.info("Entity id : {} is saved.",entity.getId());
		
		return repository.findByUserId(entity.getUserId());
	}
	
	private void validate(final TodoEntity entity) {
		//validations
		if(entity == null) {
			log.warn("Entity Cannot be null");
			throw new RuntimeException("Entity cannot be null.");
		}
		if(entity.getUserId() == null) {
			log.warn("Unknown User");
			throw new RuntimeException("Unknown User");
		}
	}
}
