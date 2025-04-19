package pe.com.bcp.employee.msemployee.service;

import pe.com.bcp.employee.msemployee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee productEntity);

    List<Employee> findByLikeNombre(String nombre);

    Optional<Employee> findById(Long id);

    Employee update(Employee productoEntity);

    void delete(Long id);
}
