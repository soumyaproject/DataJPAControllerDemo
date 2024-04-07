package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Employee
{
	public Employee(Integer id, String name, Integer sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public Employee() {
		super();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	@Id
	private Integer id;
	
	public String name;
	
	public Integer sal;
	
}