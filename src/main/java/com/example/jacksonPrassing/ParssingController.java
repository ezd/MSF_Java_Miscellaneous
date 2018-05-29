package com.example.jacksonPrassing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonGetter;

@RestController
public class ParssingController {

	
	@RequestMapping("/listparsing")
	Response getItemsList(){
		Response r=new Response();
		r.setItemsList(this.getItems());
		r.setStringValue("string value");
		return r;
	}

	
	private List<Item> getItems() {
		List<Item> items=new ArrayList<Item>();
		items.add(new Item("item-1",1));
		items.add(new Item("Item-2",2));
		return items;
	}
	
}
