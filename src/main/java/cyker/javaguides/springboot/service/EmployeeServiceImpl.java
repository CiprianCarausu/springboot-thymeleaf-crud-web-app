package cyker.javaguides.springboot.service;

import cyker.javaguides.springboot.model.Employee;
import cyker.javaguides.springboot.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
