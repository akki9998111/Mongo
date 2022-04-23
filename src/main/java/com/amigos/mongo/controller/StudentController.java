package com.amigos.mongo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.mongo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private MongoTemplate  mongoTemplate;
	
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student) {
		
		LocalDateTime ld =LocalDateTime.now();
		student.setCreatedAt(ld);
		mongoTemplate.save(student);

		return "Saved successfully";
	}

}
