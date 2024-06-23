package EmployeeCrudOpertaion.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EmployeeCrudOpertaion.Entity.Employee;
import EmployeeCrudOpertaion.Service.EmployeeQueryService;

@RestController
@RequestMapping("/abi/getByName")
public class EmployeeQueryController {
	
	@Autowired
	private EmployeeQueryService employeeQueryService;
	
	@GetMapping("/{name}")
	public Optional<Employee> getByName(@PathVariable ("name")String name)
	{
		return employeeQueryService.getByName(name);
	}

}
