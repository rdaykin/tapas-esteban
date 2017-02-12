package com.tplace.tapasesteban.factory;

import com.tplace.tapasesteban.model.menu.MenuCategory;

public class MenuCategoryFactory {
	
	public MenuCategory createNewCategory(String name){
		MenuCategory menuCategory = new MenuCategory();
		menuCategory.setName(name);
		return menuCategory;
	}
	
	

}
