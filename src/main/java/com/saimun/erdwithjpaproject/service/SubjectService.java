package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.model.Subject;
import com.saimun.erdwithjpaproject.repo.StudentRepository;
import com.saimun.erdwithjpaproject.repo.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
	private final SubjectRepository subjectRepository;

	public SubjectService(SubjectRepository subjectRepository) {
		this.subjectRepository = subjectRepository;
	}


	public Subject saveSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	public void saveAll(List<Subject> list) {
		subjectRepository.saveAll(list);
	}
}
