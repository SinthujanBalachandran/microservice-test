package com.example.moviecatalogservice.entities;

public class Model {
	private String name;
	private String desc;
	private String rating;
	
	public Model(String name,String desc,String rating) {
		this.name=name;
		this.desc=desc;
		this.rating=rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
