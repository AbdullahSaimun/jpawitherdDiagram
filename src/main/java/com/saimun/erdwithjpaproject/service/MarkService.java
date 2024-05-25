package com.saimun.erdwithjpaproject.service;

import com.saimun.erdwithjpaproject.model.Mark;
import com.saimun.erdwithjpaproject.repo.MarkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {
	private final MarkRepository markRepository;

	public MarkService(MarkRepository markRepository) {
		this.markRepository = markRepository;
	}

	public Mark saveMark(Mark mark) {
		return markRepository.save(mark);
	}

	public List<Mark> getAllMarks() {
		return markRepository.findAll();
	}

	public void saveAll(List<Mark> list) {
		markRepository.saveAll(list);
	}
}
