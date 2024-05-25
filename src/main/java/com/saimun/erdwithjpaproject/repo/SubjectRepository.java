package com.saimun.erdwithjpaproject.repo;

import com.saimun.erdwithjpaproject.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}