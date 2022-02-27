package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    // creates a method from spring and creates query from naming method
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
