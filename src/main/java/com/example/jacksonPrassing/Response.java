package com.example.jacksonPrassing;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
@JsonRootName("myResponse")
@JsonPropertyOrder(value= {"stringValue","itemsList"})
public class Response {
	
	List<Item> itemsList;
	String stringValue;
	@JsonRawValue
	String style="{\"color\":\"red\", \"border\":\"1px solid red\"}";
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	@JsonGetter("myItems")
	public List<Item> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<Item> itemsList) {
		this.itemsList = itemsList;
	}
	@JsonGetter("myStringValue")
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	

}
