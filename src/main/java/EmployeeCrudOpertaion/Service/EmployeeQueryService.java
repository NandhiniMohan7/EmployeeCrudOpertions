package EmployeeCrudOpertaion.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeeCrudOpertaion.Entity.Employee;
import EmployeeCrudOpertaion.Repository.EmployeeRepository;

@Service
public class EmployeeQueryService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Optional<Employee> getByName(String name)
	{
		 Optional<Employee> employee = employeeRepository.findByEmpName(name);
		
		 return employee;
	}
	
	

}
