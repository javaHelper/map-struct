package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.entity.StudentEntity;
import com.example.demo.model.Student;

@Mapper
public interface StudentMapper {

	@Mapping(target = "className", source = "classVal")
	@Mapping(target="subject", source="subject.name")
	Student getModelFromEntity(StudentEntity studentEntity);


	@Mapping(target="classVal", source="className")
	@Mapping(target="subject.name", source="subject")
	StudentEntity getEntityFromModel(Student student);
}
