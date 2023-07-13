package project.demo.ems.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.demo.ems.dto.EmployeeDto;
import project.demo.ems.entity.Employee;
import project.demo.ems.mapper.EmployeeMapper;
import project.demo.ems.repository.EmployeeRepository;
import project.demo.ems.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
