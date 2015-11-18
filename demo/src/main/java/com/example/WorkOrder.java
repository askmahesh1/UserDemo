package com.example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class WorkOrder {
	
	@Id
	private String workOrderNo;
	private String workType;
	private String status;
	private Date createdOn;
	private String createdBy;
	

}
