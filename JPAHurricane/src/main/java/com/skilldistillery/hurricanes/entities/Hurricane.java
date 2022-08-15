package com.skilldistillery.hurricanes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hurricane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	private Integer category;
	
	private Integer year;
	
	private String state;
	
	@Column(name="maximum_wind")
	private Integer maxWind;
	
	private String cost;
	
	private Integer fatalities;

	public Hurricane() {
		super();
	}

	
	public Hurricane(int id, String name, Integer category, Integer year, String state, Integer maxWind, String cost,
			Integer fatalities) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.year = year;
		this.state = state;
		this.maxWind = maxWind;
		this.cost = cost;
		this.fatalities = fatalities;
	}


	public Integer getCategory() {
		return category;
	}


	public void setCategory(Integer category) {
		this.category = category;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Integer getMaxWind() {
		return maxWind;
	}


	public void setMaxWind(Integer maxWind) {
		this.maxWind = maxWind;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cost) {
		this.cost = cost;
	}


	public Integer getFatalities() {
		return fatalities;
	}


	public void setFatalities(Integer fatalities) {
		this.fatalities = fatalities;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hurricane [id=" + id + ", name=" + name + ", category=" + category + ", year=" + year + ", state="
				+ state + ", maxWind=" + maxWind + ", cost=" + cost + ", fatalities=" + fatalities + "]";
	}

}
