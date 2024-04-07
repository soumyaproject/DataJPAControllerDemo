package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Model.Employee;

public interface Repositorydemo extends JpaRepository<Employee, Integer> {

	@Query("Select e from Employee e")
	public List<Employee> getallEmployee();
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Employee e WHERE e.id = :id")
	void DeleteByID(Integer id);
	
	
	@Query("Select e from Employee e WHERE e.id = :id")
	public Employee getByID(Integer id);

}
