package com.tplace.tapasesteban;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tplace.tapasesteban.factory.MenuCategoryFactory;
import com.tplace.tapasesteban.factory.MenuItemFactory;
import com.tplace.tapasesteban.services.MenuService;

@Configuration
@ComponentScan({ "com.tplace.tapasesteban" })
public class SpringRootConfig {
	
	MenuItemFactory itemFactory = new MenuItemFactory();
	
	@Bean(name="categoryFactory")
	public MenuCategoryFactory menuCategoryFactory(){
		return new MenuCategoryFactory();
	}
	
	@Bean(name="itemFactory")
	public MenuItemFactory menuItemFactory(){
		return new MenuItemFactory();
	}
	
	@Bean(name="menuService")
	public MenuService menuService(){
		return new MenuService();
	}
	
	
	
}