package com.assessment.tax.service;

import com.assessment.tax.entity.*;

import java.util.List;

public interface TellerMachineService {

	void addItem(Item item);
	void printTotalTaxAmount();
	void printSlip();
	void addAllItems(List<Item> items);
}
