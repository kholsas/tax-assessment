package com.assessment.tax.service;

import java.util.*;

import com.assessment.tax.entity.*;

public interface RulesService {
 
	double getTaxValueForItem(Item item);
	double getTotalTaxValue(List<Item> items);

	double getTotalSalesTax(List<Item> items);
}
