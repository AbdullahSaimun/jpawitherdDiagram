package com.saimun.erdwithjpaproject.controller;

import com.saimun.erdwithjpaproject.model.Student;
import com.saimun.erdwithjpaproject.model.Teacher;
import com.saimun.erdwithjpaproject.service.StudentService;
import com.saimun.erdwithjpaproject.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllController {

	private final TeacherService teacherService;
	private final StudentService studentService;

	public AllController(TeacherService teacherService, StudentService studentService) {
		this.teacherService = teacherService;
		this.studentService = studentService;
	}

	@GetMapping(value = "/teacherList", produces = "application/json")
	public List<Teacher> getTeacherList() {
		return teacherService.getAllTeachers();
	}
	@GetMapping(value = "/studentList", produces = "application/json")
	public List<Student> getStudentList() {
		return studentService.getAllStudents();
	}
}
