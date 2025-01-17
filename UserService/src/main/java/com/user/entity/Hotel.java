package com.user.entity;

public class Hotel {
	private Integer hotelId;
	private String name;
	private String location;
	private String about;

	public Hotel(Integer hotelId, String name, String location, String about) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.location = location;
		this.about = about;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return hotelId;
	}

	public void setId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
