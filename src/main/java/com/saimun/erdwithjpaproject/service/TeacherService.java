package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.model.Teacher;
import com.saimun.erdwithjpaproject.repo.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
	private final TeacherRepository teacherRepository;

	public TeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public List<Teacher> getAllTeachers() {
		var allTeacher =  teacherRepository.findAll();
		return allTeacher;
	}

	public void saveAll(List<Teacher> list) {
		teacherRepository.saveAll(list);
	}
}
