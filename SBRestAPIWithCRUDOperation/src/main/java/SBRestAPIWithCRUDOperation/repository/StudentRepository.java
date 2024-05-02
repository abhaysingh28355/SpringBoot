package SBRestAPIWithCRUDOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SBRestAPIWithCRUDOperation.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
