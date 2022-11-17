package com.julian.omc.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY)
	//a column is created in product
	@JoinColumn(name="category_id",referencedColumnName = "category_id")
	private Category category;
	private double Price;
	private double weight;
	private String description;
	private String imageName;
	
}
