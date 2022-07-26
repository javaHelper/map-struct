package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.model.Student;
import com.example.demo.model.StudentEntity;

@Mapper
public interface StudentMapper {

	@Mapping(target = "className", source = "classVal")
	Student getModelFromEntity(StudentEntity studentEntity);
	
	
	@Mapping(target = "classVal", source = "className")
	StudentEntity getEntityFromModel(Student student);
}
