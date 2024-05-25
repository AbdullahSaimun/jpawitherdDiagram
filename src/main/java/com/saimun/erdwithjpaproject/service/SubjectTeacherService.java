package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.dto.SubjectTeacherResponseDTO;
import com.saimun.erdwithjpaproject.model.SubjectTeacher;
import com.saimun.erdwithjpaproject.repo.SubjectTeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectTeacherService {
	private final SubjectTeacherRepository subjectTeacherRepository;

	public SubjectTeacherService(SubjectTeacherRepository subjectTeacherRepository) {
		this.subjectTeacherRepository = subjectTeacherRepository;
	}

	public SubjectTeacher saveSubjectTeacher(SubjectTeacher subjectTeacher) {
		return subjectTeacherRepository.save(subjectTeacher);
	}

	public List<SubjectTeacherResponseDTO> getAllSubjectTeachers() {
		return subjectTeacherRepository.findAll()
				.stream()
				.map(obj -> {
					SubjectTeacherResponseDTO dto = new SubjectTeacherResponseDTO();
					dto.setId(obj.getId());
					dto.setTeacher_id(obj.getId());
					dto.setSubject_id(obj.getSubject().getId());
					dto.setGroup_id(obj.getStudyGroup().getId());
					dto.setTeacherName(STR."\{obj.getTeacher().getFirstName()} \{obj.getTeacher().getLastName()}");
					dto.setSubjectName(obj.getSubject().getTitle());
					dto.setGroupName(obj.getStudyGroup().getName());
					return dto;
				}).collect(Collectors.toList());
	}


	public void saveAll(List<SubjectTeacher> list) {
		subjectTeacherRepository.saveAll(list);
	}
}
