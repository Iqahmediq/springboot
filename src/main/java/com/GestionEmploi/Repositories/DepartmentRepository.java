package com.GestionEmploi.Repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.GestionEmploi.entities.Department;
@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Long>{
}