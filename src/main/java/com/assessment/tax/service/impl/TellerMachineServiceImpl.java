package com.assessment.tax.service.impl;

import com.assessment.tax.data.*;
import com.assessment.tax.data.impl.*;
import com.assessment.tax.entity.*;
import com.assessment.tax.service.*;

public class TellerMachineServiceImpl implements TellerMachineService{
	
	private DataManager dataManager = new DataManagerImpl();
	private RulesService rulesService = new RuleServiceImpl();

	public void addItem(Item item) {
		dataManager.addItem(item);
	}

	public void printTotalTaxAmount() {
		System.out.printf ("%.2f",rulesService.getTotalTaxValue(dataManager.getAllItems()));
	}

}
