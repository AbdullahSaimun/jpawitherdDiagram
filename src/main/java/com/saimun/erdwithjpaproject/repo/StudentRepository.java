package com.saimun.erdwithjpaproject.repo;

import com.saimun.erdwithjpaproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}