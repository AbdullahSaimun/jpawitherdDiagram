package com.saimun.erdwithjpaproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectTeacherResponseDTO {
	private Integer id;
	private Integer subjectId;
	private String subjectName;
	private Integer teacherID;
	private String teacherName;
	private Integer groupId;
	private String groupName;
}
