package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.model.StudentEntity;

@SpringBootTest
public class BasicMappingApplicationTests {

	private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

	@Test
	public void testEntityToModel() {
		StudentEntity entity = new StudentEntity();
		entity.setClassVal("X");
		entity.setName("John");
		entity.setId(1);

		Student model = studentMapper.getModelFromEntity(entity);

		assertEquals(entity.getClassVal(), model.getClassName());
		assertEquals(entity.getName(), model.getName());
		assertEquals(entity.getId(), model.getId());
	}

	@Test
	public void testModelToEntity() {
		Student model = new Student();
		model.setId(1);
		model.setName("John");
		model.setClassName("X");

		StudentEntity entity = studentMapper.getEntityFromModel(model);

		assertEquals(entity.getClassVal(), model.getClassName());
		assertEquals(entity.getName(), model.getName());
		assertEquals(entity.getId(), model.getId());
	}
}
