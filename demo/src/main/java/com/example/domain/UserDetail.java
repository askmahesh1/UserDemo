package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class UserDetail {

	@Id
	private String userID;
	private String userName;
	private String employeeNo;
	private String employeeStatus;
	private String emailAddress;
	
	
}
