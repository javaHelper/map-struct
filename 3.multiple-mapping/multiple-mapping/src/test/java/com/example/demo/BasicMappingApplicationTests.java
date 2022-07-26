package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.AddressEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.DeliveryAddressMapper;
import com.example.demo.model.DeliveryAddress;

@SpringBootTest
public class BasicMappingApplicationTests {

	private DeliveryAddressMapper deliveryAddressMapper = Mappers.getMapper(DeliveryAddressMapper.class);
	
	@Test
	public void testEntityToModel() {
		StudentEntity student = new StudentEntity();
		student.setClassVal("X");
		student.setName("John");
		student.setId(1);

		AddressEntity address = new AddressEntity();
		address.setCity("Y");
		address.setState("Z");
		address.setHouseNo(1);

		DeliveryAddress deliveryAddress = deliveryAddressMapper.getDeliveryAddress(student, address);
		System.out.println(deliveryAddress);
		
		assertEquals(deliveryAddress.getName(), student.getName());
		assertEquals(deliveryAddress.getCity(), address.getCity());
		assertEquals(deliveryAddress.getState(), address.getState());
		assertEquals(deliveryAddress.getHouseNumber(), address.getHouseNo());
	}
}
