package com.emp.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpRequestDTO {		
		private String empName;
		@JsonFormat(pattern="dd/MM/yyyy")
		private Date doj;
		private char gender;
		private float salray;
		private boolean isIndian;
		private long contactNumber;
		private String email;
}
