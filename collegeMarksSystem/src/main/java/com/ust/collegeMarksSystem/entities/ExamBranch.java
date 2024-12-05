package com.ust.collegeMarksSystem.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ExamBranch {
	ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student stu) {
		students.add(stu);
	}
}
