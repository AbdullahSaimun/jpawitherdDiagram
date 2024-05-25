package com.saimun.erdwithjpaproject.dataloader;

import com.saimun.erdwithjpaproject.model.*;
import com.saimun.erdwithjpaproject.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

	private final MarkService markService;
	private final StudentService studentService;
	private final StudyGroupService studyGroupService;
	private final SubjectService subjectService;
	private final SubjectTeacherService subjectTeacherService;
	private final TeacherService teacherService;

	public DataLoader(MarkService markService, StudentService studentService, StudyGroupService studyGroupService, SubjectService subjectService, SubjectTeacherService subjectTeacherService, TeacherService teacherService) {
		this.markService = markService;
		this.studentService = studentService;
		this.studyGroupService = studyGroupService;
		this.subjectService = subjectService;
		this.subjectTeacherService = subjectTeacherService;
		this.teacherService = teacherService;
	}

	@Override
	public void run(String... args) throws Exception {
//		studyGroup
		StudyGroup group1 = new StudyGroup();
		group1.setName("Group 1");
		StudyGroup group2 = new StudyGroup();
		group2.setName("Group 2");
		studyGroupService.saveAll(Arrays.asList(group1,group2));

//		Student
		Student student1 = new Student();
		student1.setFirstName("John");
		student1.setLastName("Doe");
		student1.setStudyGroup(group1);

		Student student2 = new Student();
		student2.setFirstName("Jane");
		student2.setLastName("Smith");
		student2.setStudyGroup(group2);

		Student student3 = new Student();
		student3.setFirstName("abdulla");
		student3.setLastName("saimun");
		student3.setStudyGroup(group2);

		studentService.saveAll(Arrays.asList(student1, student2, student3));

//		Teacher
		Teacher teacher1 = new Teacher();
		teacher1.setFirstName("Mr.");
		teacher1.setLastName("Brown");
		Teacher teacher2 = new Teacher();
		teacher2.setFirstName("Mrs.");
		teacher2.setLastName("Green");

		teacherService.saveAll(Arrays.asList(teacher1, teacher2));

		// Subjects
		Subject subject1 = new Subject();
		subject1.setTitle("Mathematics");
		Subject subject2 = new Subject();
		subject2.setTitle("Science");

		subjectService.saveAll(Arrays.asList(subject1, subject2));

		// SubjectTeacher relationships
		SubjectTeacher subjectTeacher1 = new SubjectTeacher();
		subjectTeacher1.setSubject(subject1);
		subjectTeacher1.setTeacher(teacher1);
		subjectTeacher1.setStudyGroup(group1);

		SubjectTeacher subjectTeacher2 = new SubjectTeacher();
		subjectTeacher2.setSubject(subject2);
		subjectTeacher2.setTeacher(teacher2);
		subjectTeacher2.setStudyGroup(group2);

		subjectTeacherService.saveAll(Arrays.asList(subjectTeacher1, subjectTeacher2));

		// Create and save some Marks
		Mark mark1 = new Mark();
		mark1.setStudent(student1);
		mark1.setSubject(subject1);
		mark1.setDate(LocalDateTime.now());
		mark1.setMark(85);

		Mark mark2 = new Mark();
		mark2.setStudent(student2);
		mark2.setSubject(subject2);
		mark2.setDate(LocalDateTime.now());
		mark2.setMark(90);

		Mark mark3 = new Mark();
		mark3.setStudent(student3);
		mark3.setSubject(subject2);
		mark3.setDate(LocalDateTime.now());
		mark3.setMark(88);

		markService.saveAll(Arrays.asList(mark1, mark2, mark3));


	}
}
