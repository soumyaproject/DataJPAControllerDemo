package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.Repositorydemo;

@Controller
public class Controllerdemo {
	
	@Autowired
	private Repositorydemo repo;
	
	@RequestMapping("/home")
	public String Homepages()
	{
	return "Home";
	}
	
	@RequestMapping("/registration")
	public String RegisterEmployee()
	{
		
		return "Registration";
	}
	
	@PostMapping("/submit")
	public String AddEmployee(@ModelAttribute Employee employee)
	{
		repo.save(employee);
		return "Home";
	}
	@RequestMapping("/getAll")
	public String EmployeeList(Model model)
	{
		List<Employee> employee=repo.getallEmployee();
		model.addAttribute("employee", employee);
		return "Employee";
	}
	
	@RequestMapping("/deleteById/{id}")
	public String DeleteId(@PathVariable Integer id,Model model)
	{
		repo.DeleteByID(id);
		List<Employee> employee=repo.getallEmployee();
		model.addAttribute("employee", employee);
		return "Employee";
	}
	@RequestMapping("/getById/{id}")
	public String getbyId(@PathVariable Integer id,Model model)
	{
		Employee emp=repo.getByID(id);
		model.addAttribute("employee", emp);
		return "EmployeeUpdate";
	}
	@PostMapping("/updatesubmit/{id}")
	public String updateById(@ModelAttribute Employee employee1,@PathVariable Integer id,Model model)
	{
		Employee emp=repo.getByID(id);
		emp.setName(employee1.name);
		emp.setSal(employee1.sal);
		repo.save(emp);
		List<Employee> employee=repo.getallEmployee();
		model.addAttribute("employee", employee);
		return "Employee";
	}
	
	
	
	

}
