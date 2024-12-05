package com.ust.collegeMarksSystem.entities;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.HashMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	
	@Autowired
	private Semester semester;
	
	@Id
	private int studentId;
	private String department;


}
