package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.model.SubjectTeacher;
import com.saimun.erdwithjpaproject.repo.SubjectTeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectTeacherService {
	private final SubjectTeacherRepository subjectTeacherRepository;

	public SubjectTeacherService(SubjectTeacherRepository subjectTeacherRepository) {
		this.subjectTeacherRepository = subjectTeacherRepository;
	}

	public SubjectTeacher saveSubjectTeacher(SubjectTeacher subjectTeacher) {
		return subjectTeacherRepository.save(subjectTeacher);
	}

	public List<SubjectTeacher> getAllSubjectTeachers() {
		return subjectTeacherRepository.findAll();
	}


	public void saveAll(List<SubjectTeacher> list) {
		subjectTeacherRepository.saveAll(list);
	}
}
