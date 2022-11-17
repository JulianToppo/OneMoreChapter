package com.julian.omc.dto;

import lombok.Data;

@Data
public class ProductDto {
	private long id;
	private String name;
	private int categoryId;
	private double Price;
	private double weight;
	private String description;
	private String imageName;
}
