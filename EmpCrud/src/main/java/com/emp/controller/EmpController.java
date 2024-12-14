package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.dto.EmpRequestDTO;
import com.emp.dto.EmpResponseDTO;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public EmpResponseDTO addProduct(@RequestBody EmpRequestDTO empRequestDTO) {
        return employeeService.saveEmployee(empRequestDTO);
    }
    @GetMapping("/empList")
    public List<EmpResponseDTO> findAllProducts() {
        return employeeService.getEmpList();
    }

}
