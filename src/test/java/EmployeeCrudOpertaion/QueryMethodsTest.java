package EmployeeCrudOpertaion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import EmployeeCrudOpertaion.Entity.Employee;
import EmployeeCrudOpertaion.Repository.EmployeeRepository;

@SpringBootTest
public class QueryMethodsTest {
	
	@Autowired
	private  EmployeeRepository employeeRepository;
	
	@Test
	public void getByEmployeeName()
	{
		Employee employee=employeeRepository.findByEmpName("Nandhini").get();
		         System.out.println(employee.getEmpId());
		         System.out.println(employee.getEmpName());
		         System.out.println(employee.getLocation());
	}
	

}
