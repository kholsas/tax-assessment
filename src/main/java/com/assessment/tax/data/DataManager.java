package com.assessment.tax.data;

import java.util.*;

import com.assessment.tax.entity.*;
import com.assessment.tax.entity.Item.*;

public interface DataManager {

	void addItem(Item item);
	boolean removeItem(Long id);
	List<Item> getAllItems();
	List<Item> getItemsOfType(ItemType type);
}
