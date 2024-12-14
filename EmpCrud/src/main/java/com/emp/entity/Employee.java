package com.emp.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String eName;
	private Date doj;
	private char gender;
	private float salray;
	private boolean isIndian;
	private long contactNum;
	private String email;
	
}
