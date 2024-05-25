package com.saimun.erdwithjpaproject.controller;

import com.saimun.erdwithjpaproject.dto.SubjectTeacherResponseDTO;
import com.saimun.erdwithjpaproject.model.*;
import com.saimun.erdwithjpaproject.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllController {

	private final TeacherService teacherService;
	private final StudentService studentService;
	private final MarkService markService;
	private final SubjectService subjectService;
	private final StudyGroupService studyGroupService;
	private final SubjectTeacherService subjectTeacherService;

	public AllController(TeacherService teacherService, StudentService studentService, MarkService markService, SubjectService subjectService, StudyGroupService studyGroupService, SubjectTeacherService subjectTeacherService) {
		this.teacherService = teacherService;
		this.studentService = studentService;
		this.markService = markService;
		this.subjectService = subjectService;
		this.studyGroupService = studyGroupService;
		this.subjectTeacherService = subjectTeacherService;
	}

	@GetMapping(value = "/teacherList", produces = "application/json")
	public List<Teacher> getTeacherList() {
		return teacherService.getAllTeachers();
	}

	@GetMapping(value = "/studentList", produces = "application/json")
	public List<Student> getStudentList() {
		return studentService.getAllStudents();
	}

	@GetMapping(value = "/markList", produces = "application/json")
	public List<Mark> getAllMarks() {
		return markService.getAllMarks();
	}


	@GetMapping(value = "/subjectList", produces = "application/json")
	public List<Subject> getAllSubject() {
		return subjectService.getAllSubjects();
	}

	@GetMapping(value = "/studygroupList", produces = "application/json")
	public List<StudyGroup> getAllStudyGroup() {
		return studyGroupService.getAllGroups();
	}
	@GetMapping(value = "/subjectTeacherList", produces = "application/json")
	public List<SubjectTeacherResponseDTO> getAllSubjectTeacher() {
		return subjectTeacherService.getAllSubjectTeachers();
	}
}
