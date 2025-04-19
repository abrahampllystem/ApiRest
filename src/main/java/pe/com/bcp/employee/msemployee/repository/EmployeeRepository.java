package pe.com.bcp.employee.msemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.com.bcp.employee.msemployee.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    @Query("Select p from employee p where upper(p.firstName) like upper(:nombre) ")
    List<Employee> findByLikeNombre(@Param("nombre") String nombre);

    //AGREGATES

    @Modifying
    @Query(nativeQuery = true, value = "update tbl_employees set estado='0' where id=:id")
    void deleteCustom(@Param("id") Long id);
}
