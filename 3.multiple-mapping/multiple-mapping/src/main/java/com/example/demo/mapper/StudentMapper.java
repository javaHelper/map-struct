package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.entity.StudentEntity;
import com.example.demo.model.Student;

@Mapper
public interface StudentMapper {
	default Student getModelFromEntity(StudentEntity studentEntity){
		Student student = new Student();
		student.setId(studentEntity.getId());
		student.setName(studentEntity.getName());
		student.setClassName(studentEntity.getClassVal());
		return student;
	}

	@Mapping(target = "classVal", source = "className")
	StudentEntity getEntityFromModel(Student student);
}
