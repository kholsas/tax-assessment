package com.assessment.tax.service.impl;

import java.util.*;

import com.assessment.tax.entity.*;
import com.assessment.tax.entity.Item.*;
import com.assessment.tax.service.*;

public class RuleServiceImpl implements RulesService {

	public double getTaxValueForItem(final Item item) {

		return item.getPrice() + (item.isImported() ? item.getPrice() * 0.05d : 0)
				+ (item.getType() == ItemType.OTHER ? item.getPrice() * 0.10d : 0d);
	}

	public double getTotalTaxValue(List<Item> items) {
		double totalTaxedAmount = 0;
		for (final Item item : items) {
			totalTaxedAmount += getTaxValueForItem(item);
		}
		return totalTaxedAmount;
	}

}
