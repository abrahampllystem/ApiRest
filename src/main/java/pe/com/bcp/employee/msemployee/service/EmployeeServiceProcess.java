package pe.com.bcp.employee.msemployee.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.bcp.employee.msemployee.model.Employee;
import pe.com.bcp.employee.msemployee.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeServiceProcess implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    /**
     * @return
     */
    @Override
    public List<Employee> findAll() {
        return  employeeRepository.findAll();
    }

    /**
     * @param productEntity
     * @return
     */
    @Override
    public Employee save(Employee productEntity) {
        return employeeRepository.save(productEntity);
    }

    /**
     * @param nombre
     * @return
     */
    @Override
    public List<Employee> findByLikeNombre(String nombre) {
        return employeeRepository.findByLikeNombre("%"+nombre+"%");
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    /**
     * @param productoEntity
     * @return
     */
    @Override
    public Employee update(Employee productoEntity) {
        Optional<Employee> optProducto = employeeRepository.findById(productoEntity.getId());

        if (optProducto.isPresent()) {
            //
            Employee prmEmployeeEntity = optProducto.get();
            prmEmployeeEntity.setEmail(productoEntity.getEmail());
            prmEmployeeEntity.setFirstName(productoEntity.getFirstName());
            prmEmployeeEntity.setLastName(productoEntity.getLastName());



            return employeeRepository.save(productoEntity);
        }

        return employeeRepository.save(productoEntity);
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        employeeRepository.deleteCustom(id);

    }
}
