package com.product.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	@Column(name ="sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unitprice")
	private Float unitprice;
	
	@Column(name = "imageurl")
	private String imageurl;
	
	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "unitsinstock")
	private int unitsinstock;
	
	@Column(name = "datecreated")
	private LocalDateTime datecreated;
	
	@Column(name = "lastupdated")
	private LocalDateTime lastupdate;
	
	@Column(name = "categoryid")
	private Integer categoryid;
	
	public Product() {}

	public Product( Integer id,String sku, String name, String description, Float unitprice, String imageurl,
			Boolean active, int unitsinstock, LocalDateTime datecreated, LocalDateTime lastupdate, Integer categoryid) {
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitprice = unitprice;
		this.imageurl = imageurl;
		this.active = active;
		this.unitsinstock = unitsinstock;
		this.datecreated = datecreated;
		this.lastupdate = lastupdate;
		this.categoryid = categoryid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(Float unitprice) {
		this.unitprice = unitprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public int getUnitsinstock() {
		return unitsinstock;
	}

	public void setUnitsinstock(int unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	public LocalDateTime getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(LocalDateTime datecreated) {
		this.datecreated = datecreated;
	}

	public LocalDateTime getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(LocalDateTime lastupdate) {
		this.lastupdate = lastupdate;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	

	
	
}
