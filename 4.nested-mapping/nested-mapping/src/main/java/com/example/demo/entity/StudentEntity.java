package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity {
	private int id;
	private String name;
	private String classVal;
	private SubjectEntity subject;
}