package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.model.Student;
import com.saimun.erdwithjpaproject.repo.StudentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student saveStudent(Student student) {
		return studentRepository.saveAndFlush(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public void saveAll(List<Student> list) {
		studentRepository.saveAll(list);
	}
}
