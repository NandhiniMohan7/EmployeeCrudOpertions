package EmployeeCrudOpertaion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeeCrudOpertaion.Entity.Employee;
import EmployeeCrudOpertaion.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee)
	{
		Employee employeedetails=employeeRepository.save(employee);
		return employeedetails;
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees=employeeRepository.findAll();
		return employees;
	}
	
	public Employee getEmployee(Long id)
	{
		Employee employee=employeeRepository.findById(id).get();
		return employee;
	}
	
	public Employee updateemployee(Long id,Employee updateEmp)
	{
		Employee employee=employeeRepository.findById(id).get();
		         employee.setEmpName(updateEmp.getEmpName());
		         employee.setEmpId(updateEmp.getEmpId());
		         employee.setLocation(updateEmp.getLocation());
		         Employee updatedemployees=employeeRepository.save(employee);
		         return updatedemployees;
	}
	
	public String deleteEmployee(Long id)
	{
		employeeRepository.deleteById(id);
		return "Employee deleted successfully";
	}
	
	}


