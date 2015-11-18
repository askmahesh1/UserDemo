package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDetailRepository;
import com.example.domain.UserDetail;

@RestController
@RequestMapping("/users")
public class UserDetailController {
	
	private final UserDetailRepository repository;
	
	@Autowired
	public UserDetailController(UserDetailRepository repository){
		this.repository = repository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable findAll(){
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public UserDetail create(@RequestBody UserDetail detail){
		return repository.save(detail);
	}

}
