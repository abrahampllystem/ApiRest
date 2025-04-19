package pe.com.bcp.employee.msemployee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "employee")
@Table(name = "tbl_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Column(nullable = false, name = "email_id")
    private String email;


    @Column(name = "estado", nullable = false)
    private String estado;
}
