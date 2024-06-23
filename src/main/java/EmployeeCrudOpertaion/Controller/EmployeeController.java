package EmployeeCrudOpertaion.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EmployeeCrudOpertaion.Entity.Employee;
import EmployeeCrudOpertaion.Service.EmployeeService;

@RestController
@RequestMapping(value="/api/empDetails")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id")Long id)
	{
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/updateEmployees/{id}")
	public Employee updateEmployee(@PathVariable("id")Long id,@RequestBody Employee employee)
	{
		return employeeService.updateemployee(id, employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") Long id)
	{
		return employeeService.deleteEmployee(id);
	}
}
