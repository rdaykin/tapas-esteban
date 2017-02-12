package com.tplace.tapasesteban.model.menu;

import java.util.HashSet;
import java.util.Set;

public class MenuCategory {
	
	private String name;
	
	private Set<MenuItem> menuItems;

	public MenuCategory(){
		menuItems = new HashSet<MenuItem>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addMenuItem(MenuItem item){
		menuItems.add(item);
	}
	
	public void removeMenuItem(String name){
		menuItems.stream().filter(menuItem->menuItem.getName().equals(name)).forEach(menuItem->menuItems.remove(menuItem));
	}
	
	public Set<MenuItem> getMenuItems(){
		return menuItems;
	}

}
