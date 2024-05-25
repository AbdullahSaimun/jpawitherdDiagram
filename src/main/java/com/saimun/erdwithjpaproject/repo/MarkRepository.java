package com.saimun.erdwithjpaproject.repo;

import com.saimun.erdwithjpaproject.model.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepository extends JpaRepository<Mark, Integer> {
}