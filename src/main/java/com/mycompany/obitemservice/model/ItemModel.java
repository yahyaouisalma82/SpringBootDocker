package com.mycompany.obitemservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemModel {
    private String id;
    private String name;
    private String description;
    private Double price;
    private String categoryId;
	public String getId() { 
		return this.id;
	}
	public Double getPrice() { 
		return this.price;
	}
	public void setPrice(Double price2) {
		this.price = price2;		
	}
}
