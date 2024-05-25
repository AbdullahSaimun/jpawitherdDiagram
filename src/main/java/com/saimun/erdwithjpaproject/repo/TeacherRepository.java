package com.saimun.erdwithjpaproject.repo;

import com.saimun.erdwithjpaproject.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}