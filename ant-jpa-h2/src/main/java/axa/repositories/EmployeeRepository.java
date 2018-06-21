package axa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import axa.entities.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, String>{
	public List<Employee> findByName(String name);

}
