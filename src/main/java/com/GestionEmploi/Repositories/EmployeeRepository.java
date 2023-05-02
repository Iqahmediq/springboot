package com.GestionEmploi.Repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.GestionEmploi.entities.Employee;
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}