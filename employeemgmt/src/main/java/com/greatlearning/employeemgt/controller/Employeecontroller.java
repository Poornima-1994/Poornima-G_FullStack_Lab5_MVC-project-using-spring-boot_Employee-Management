package com.greatlearning.employeemgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.employeemgmt.entity.Employee;
import com.greatlearning.employeemgmt.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class Employeecontroller {
	
	@Autowired
	EmployeeService service;
	
	/*
	 *  /employees/ --  GET
	 *  /employees/new --GET
	 *  /employees/edit/{id} --GET
	 *  /employees/delete/{id}--GET
	 *	/employees/save -- POST
	 *  /employees/save/{id}-- POST
	 */
	
	@GetMapping("/")
	public String getAllEmployees(Model model) {
		model.addAttribute("employees",service. getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/new")
	public String addNewEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "create_employee";
	}
	
	@GetMapping("/edit/{id}")
	public String editEmployee(Model model, @PathVariable("name=id") int id) {
		model.addAttribute("employee", service.findById(id));
		return "edit_employee";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("name=id") int id) {
		service.deleteById(id);
		return "redirect:/employees/";
	}
	
	@PostMapping("/save")
	public String createEmployee(@ModelAttribute(name="employee") Employee emp) {
		service.saveEmployee(emp);
		return "redirect:/employees/";
	}
	
	@PostMapping("/save/{id}")
	public String createEmployee(@PathVariable(name="id") Integer id,@ModelAttribute(name="employee") Employee emp) {
		emp.setEmpId(id, id);
		service.saveEmployee(emp);
		return "redirect:/employees/";
	}

}

