package com.ust.collegeMarksSystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Semester {
	
		@Id
		private int semId;
		private int sub1;
		private int sub2;
		private int sub3;
		private int sub4;
		private int pra1;
		private int pra2;

}
