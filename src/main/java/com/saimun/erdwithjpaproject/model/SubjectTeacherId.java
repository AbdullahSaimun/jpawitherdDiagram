package com.saimun.erdwithjpaproject.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class SubjectTeacherId implements Serializable {
	private Integer subject;
	private Integer teacher;

	public SubjectTeacherId() {
	}

	public SubjectTeacherId(Integer subject, Integer teacher) {
		this.subject = subject;
		this.teacher = teacher;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SubjectTeacherId that = (SubjectTeacherId) o;
		return Objects.equals(subject, that.subject) && Objects.equals(teacher, that.teacher);
	}

	@Override
	public int hashCode() {
		return Objects.hash(subject, teacher);
	}
}
