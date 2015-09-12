package com.assessment.tax.data.impl;

import java.util.*;

import com.assessment.tax.data.*;
import com.assessment.tax.entity.*;
import com.assessment.tax.entity.Item.*;

public class DataManagerImpl implements DataManager{

	private Map<Long, Item> mapOfAllItemsByIds = new HashMap<Long, Item>();
	public void addItem(Item item) {
		//if duplicated, the original item will be replaced by the new
			mapOfAllItemsByIds.put(item.getId(), item);		
	}

	public boolean removeItem(Long key) {
		return mapOfAllItemsByIds.remove(key) != null;
	 
		
	}

	public List<Item> getAllItems() {
		return new ArrayList<Item>(mapOfAllItemsByIds.values());
	}

	public List<Item> getItemsOfType(ItemType type) {
		List<Item> itemsToReturn = new ArrayList<Item>();

		for(final Item item : mapOfAllItemsByIds.values()){
			if(item.getType() == type){
				itemsToReturn.add(item);
			}
		}
		
		return itemsToReturn;
	}

}
