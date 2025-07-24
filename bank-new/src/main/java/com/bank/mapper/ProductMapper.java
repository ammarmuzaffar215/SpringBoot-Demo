package com.bank.mapper;

// TODO: SpringBoot:Practical 7.2 - create a mapper class and mapper test class ProductMapperTest.java for Product entity
// Use CustomerMapper.java as reference

import java.util.List;

import org.mapstruct.Mapper;

import com.bank.entity.ProductEntity;
import com.bank.model.ProductDTO;


@Mapper
public interface ProductMapper {

	ProductDTO toDto(ProductEntity entity);

	ProductEntity toEntity(ProductDTO dto);
	
  List<ProductDTO> toDtoList(List<ProductEntity> entityList);

  List<ProductEntity> toEntityList(List<ProductDTO> dtoList);
}

