package com.tplace.tapasesteban.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.tplace.tapasesteban.factory.MenuCategoryFactory;
import com.tplace.tapasesteban.factory.MenuItemFactory;
import com.tplace.tapasesteban.model.menu.MenuCategory;
import com.tplace.tapasesteban.model.menu.MenuItem;



public class MenuService {
	
	private Set<MenuCategory> categorySet = new HashSet<>();
	
	@Autowired
	private MenuCategoryFactory categoryFactory;
	
	@Autowired
	private MenuItemFactory itemFactory;
	
	public void addNewCategory(String categoryName){
		categorySet.add(categoryFactory.createNewCategory(categoryName));
	}
	
	public void removeCategory(String categoryName){
		categorySet.stream().filter(category -> category.getName().equals(categoryName)).forEach(category -> categorySet.remove(category));
	}
	
	public void addMenuItemToCategory(MenuItem menuItem, String categoryName){
		categorySet.stream().filter(category -> category.getName().equals(categoryName)).forEach(category -> category.addMenuItem(menuItem));
	}
	
	private Set<String> getCategoryNames(){
		Set<String> categoryNames = new HashSet<String>();
		categorySet.stream().forEach(category -> categoryNames.add(category.getName()));
		return categoryNames;
	}
	
	public Set<MenuCategory> getCategories(){
		return  categorySet;
	}
	
	private MenuCategory getCategory(String name){
		return categorySet.stream().filter(category -> category.getName().equals(name)).iterator().next();
	}
	
	private Set<MenuItem> getMenuItemsForCategory(String name){
		return getCategory(name).getMenuItems();
	}
	
	

}
