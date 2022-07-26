package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.entity.AddressEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.model.DeliveryAddress;

@Mapper
public interface DeliveryAddressMapper {

	@Mapping(source = "studentEntity.name", target = "name")
	@Mapping(source = "addressEntity.houseNo", target = "houseNumber")
	DeliveryAddress getDeliveryAddress(StudentEntity studentEntity, AddressEntity addressEntity);
}
