package com.tagit.fragment_demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Item extends HashMap<String, String>{

	
	private static final long serialVersionUID = -4444602266741220062L;
	private static ArrayList<Item> parts = null;
	
	public static ArrayList<Item> getParts()
	{
		if(parts == null)
		{
			ArrayList<Item> c = new ArrayList<Item>();
			c.add(new Item("p001","Screw 100mm",7));
			c.add(new Item("p002","Pencil 100mm",7));
			c.add(new Item("p003","Essear 100mm",7));
			parts = c;
		}
		
		return parts;
	}
	
	public Item(String id,String desc,int cost)
	{
		put("id",id);
		put("description",desc);
		put("cost",Integer.toString(cost));
		
	}
}
