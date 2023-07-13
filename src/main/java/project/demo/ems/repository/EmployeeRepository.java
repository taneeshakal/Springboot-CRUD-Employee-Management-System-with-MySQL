package project.demo.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.demo.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
