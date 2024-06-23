package EmployeeCrudOpertaion.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EmployeeCrudOpertaion.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	Optional<Employee> findByEmpName(String name);
	

}
