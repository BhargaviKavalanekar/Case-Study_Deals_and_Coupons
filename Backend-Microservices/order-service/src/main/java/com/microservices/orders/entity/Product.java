package com.microservices.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

    @Id
    private String id;

    private String name;

    private String category;

    private Double price;

    private int quantity;
    private Double orgprice;
    private String image;

    private String url;

    public Product(String name, String category, Double price,Double orgprice, int quantity, String  url,String image) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.orgprice=orgprice;
        this.quantity = quantity;
        this.url = url;
        this.image=image;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getOrgprice() {
		return orgprice;
	}

	public void setOrgprice(Double orgprice) {
		this.orgprice = orgprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
    
}