package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.model.StudyGroup;
import com.saimun.erdwithjpaproject.repo.StudyGroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyGroupService {
	private final StudyGroupRepository studyGroupRepository;

	public StudyGroupService(StudyGroupRepository studyGroupRepository) {
		this.studyGroupRepository = studyGroupRepository;
	}

	public StudyGroup saveGroup(StudyGroup group) {
		return studyGroupRepository.saveAndFlush(group);
	}

	public List<StudyGroup> getAllGroups() {
		return studyGroupRepository.findAll();
	}

	public void saveAll(List<StudyGroup> list) {
		studyGroupRepository.saveAll(list);
	}
}
