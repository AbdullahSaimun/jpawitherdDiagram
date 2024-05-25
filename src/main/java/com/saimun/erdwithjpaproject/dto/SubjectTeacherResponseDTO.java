package com.saimun.erdwithjpaproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectTeacherResponseDTO {
	private Integer id;
	private Integer subject_id;
	private String subjectName;
	private Integer teacher_id;
	private String teacherName;
	private Integer group_id;
	private String groupName;
}
