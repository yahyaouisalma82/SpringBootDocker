package com.mycompany.obitemservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ItemCategoryModel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCategoryModel {
    private String id;
    private String name;
	public String getId() {
		return id;
	}
}
