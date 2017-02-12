package com.tplace.tapasesteban.model.menu;

import java.util.Set;

public class MenuItem {
	
	private String name;
	private String description;
	private Set<Integer> dietInformation;
	private Set<Integer> tags;
	
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
	
	public Set<Integer> getDietInformation() {
		return dietInformation;
	}
	
	public void setDietInformation(Set<Integer> dietInformation) {
		this.dietInformation = dietInformation;
	}
	
	public Set<Integer> getTags() {
		return tags;
	}
	
	public void setTags(Set<Integer> tags) {
		this.tags = tags;
	}

}
