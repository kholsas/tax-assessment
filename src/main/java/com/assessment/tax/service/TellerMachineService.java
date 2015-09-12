package com.assessment.tax.service;

import com.assessment.tax.entity.*;

public interface TellerMachineService {

	void addItem(Item item);
	void printTotalTaxAmount();
}
