package com.tplace.tapasesteban.factory;

import java.util.Set;

import com.tplace.tapasesteban.model.menu.MenuItem;

public class MenuItemFactory {
	
	public MenuItem createMenuItem(String name, String description, Set<Integer> tags){
		MenuItem item = new MenuItem();
		item.setName(name);
		item.setDescription(description);
		item.setTags(tags);
		return item;
	}

}
