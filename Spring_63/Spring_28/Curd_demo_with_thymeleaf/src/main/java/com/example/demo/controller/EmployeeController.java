package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;

@Controller
@RequestMapping("/employees")
public class EmployeeController 
{
	private EmployeeService empser;
	@Autowired
		public EmployeeController(EmployeeService empser) 
	{
			this.empser = empser;
	}
	@GetMapping("/list")
	public String display(Model model)
	{
		List<Employee> employee=empser.getAll();
		model.addAttribute("EMPLOYEE", employee);
		return "Employee/list-employee";	
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("EMPLOYEE",employee);
		return "Employee/employeeForm";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("EMPLOYEE") Employee employee)
	{
	    empser.insertOrUpdate(employee);
		return "redirect:/employee/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int id, Model model)
	{
		Employee employee=empser.getById(id);
		model.addAttribute("EMPLOYEE",employee);
		return "Employee/employeeForm";
	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int id)
	{
		empser.delete(id);
		return "redirect:/employee/list";
	}
	@GetMapping("/search")
	public String search(@RequestParam("employeeName") String name,Model model)
	{
		List<Employee> employees=empser.searchBy(name);
		model.addAttribute("EMPLOYEE",employees);
		return "/employee/list-employee";
	}

}

