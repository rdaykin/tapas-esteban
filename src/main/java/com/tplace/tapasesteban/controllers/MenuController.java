package com.tplace.tapasesteban.controllers;

import java.util.HashSet;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tplace.tapasesteban.factory.MenuItemFactory;
import com.tplace.tapasesteban.services.MenuService;

@Controller
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	MenuItemFactory itemFactory;
	
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	private boolean first = true;
	
	@RequestMapping("/menu")
	public String menu(Map<String,Object> model) {
		if(first){
		menuService.addNewCategory("BREAKFASTS");
		menuService.addNewCategory("PIZZAS");
		menuService.addNewCategory("SANDWICHES");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Spanish Omelette", "", new HashSet<Integer>()),"BREAKFASTS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Serrano, rocket, tomato & fried egg", "", new HashSet<Integer>()),"BREAKFASTS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Scrambled egg, mushroom & cheese", "", new HashSet<Integer>()),"BREAKFASTS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Poached egg, oven dried tomato & cheese sauce", "", new HashSet<Integer>()),"BREAKFASTS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Tolouse", "Brie, pistachio, black seedless grapes", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Zorba", "Feta, cocktail onions, oven dried tomatoes", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Americano", "", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("BBQ pork", "", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Thai", "Thai green vegetables", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Satay", "Satay roast vegetables ", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Albondigas", "Meatball marinara (tomato)", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Pesto", "Serrano, rocket & pesto", new HashSet<Integer>()),"PIZZAS");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Spiaggia", "Prawns, calamari, & mussels", new HashSet<Integer>()),"PIZZAS");
		
		first= false;
		}
		model.put("categories", menuService.getCategories());
		return "menu";
	}
	
	@RequestMapping("/tapasmenu")
	public String tapasMenu(Map<String,Object> model) {
		if(first){
		menuService.addNewCategory("Starters");
		menuService.addNewCategory("Mains");
		menuService.addNewCategory("Dessert");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Fish and Chips", "mmm, fish and chips!", new HashSet<Integer>()),"Mains");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Pate on toast", "Yay I like pate it is nice let's have some on toast", new HashSet<Integer>()),"Starters");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Toad in the hole", "Sausage and mash essentially, isn't it?", new HashSet<Integer>()),"Mains");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Soup", "Ask what we need to get rid of", new HashSet<Integer>()),"Starters");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Mushrooms", "Everyone likes some garlic mushrooms, get 'em in ya!", new HashSet<Integer>()),"Starters");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Goulash or something", "Woo here is another menu option", new HashSet<Integer>()),"Mains");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Ice Cream", "Flavours are something mad like fresh hay, moon dust and the smell of sincerity", new HashSet<Integer>()),"Dessert");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Crispy Sweet bits", "They're tooth rottingly good!", new HashSet<Integer>()),"Dessert");
		menuService.addMenuItemToCategory(itemFactory.createMenuItem("Actual turd", "Whatever, you'll eat it!", new HashSet<Integer>()),"Dessert");
		first= false;
		}
		model.put("categories", menuService.getCategories());
		return "menu";
	}

}
