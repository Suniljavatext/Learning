package com.Springbootcrud.example.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")



public class Product {
	
	@Id
	
	
	

	
	private int id;
	private String name;
	private int quantity;
	private double price;
	

}
