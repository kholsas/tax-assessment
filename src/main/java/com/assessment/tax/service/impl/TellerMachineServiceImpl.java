package com.assessment.tax.service.impl;

import com.assessment.tax.data.DataManager;
import com.assessment.tax.data.impl.DataManagerImpl;
import com.assessment.tax.entity.Item;
import com.assessment.tax.service.RulesService;
import com.assessment.tax.service.TellerMachineService;
<<<<<<< HEAD
import com.assessment.tax.client.converters.*;
=======
>>>>>>> e0d9ac0755abb2dabca4f30f2d2a8e0bd8c26c06

import java.util.List;

public class TellerMachineServiceImpl implements TellerMachineService {

<<<<<<< HEAD
	private DataManager dataManager = new DataManagerImpl();
	private RulesService rulesService = new RuleServiceImpl();

	public void addItem(Item item) {
		dataManager.addItem(item);
	}

	public void printTotalTaxAmount() {
		System.out.println(InputConverter.getFormattedAmount(rulesService.getTotalTaxValue(dataManager.getAllItems())));
	}

	@Override
	public void printSlip() {
		rulesService.getTotalTaxValue(dataManager.getAllItems());
		for (final Item item : dataManager.getAllItems()) {
			System.out.println(item);
		}
		System.out.println(
				"\nSales Tax: " + InputConverter.getFormattedAmount(rulesService.getTotalSalesTax(dataManager.getAllItems())));
		System.out.println("Total : " + InputConverter.getFormattedAmount(rulesService.getTotalTaxValue(dataManager.getAllItems())));
	}

	@Override
	public void addAllItems(List<Item> items) {
		// dataManager.getAllItems().addAll(items);
		for (Item item : items) {
			addItem(item);
		}
	}


=======
    private DataManager dataManager = new DataManagerImpl();
    private RulesService rulesService = new RuleServiceImpl();

    public void addItem(Item item) {
        dataManager.addItem(item);
    }

    public void printTotalTaxAmount() {
        System.out.println(getFormattedAmount(rulesService.getTotalTaxValue(dataManager.getAllItems())));
    }

    @Override
    public void printSlip() {
        rulesService.getTotalTaxValue(dataManager.getAllItems());
        for (final Item item : dataManager.getAllItems()) {
            System.out.println(item);
        }
        System.out.println("\nSales Tax: " + getFormattedAmount(rulesService.getTotalSalesTax(dataManager.getAllItems())));
        System.out.println("Total : " + getFormattedAmount(rulesService.getTotalTaxValue(dataManager.getAllItems())));
    }

    @Override
    public void addAllItems(List<Item> items) {
        // dataManager.getAllItems().addAll(items);
        for (Item item : items) {
            addItem(item);
        }
    }

    private String getFormattedAmount(double amount) {
        return String.format("%.2f", amount);
    }
>>>>>>> e0d9ac0755abb2dabca4f30f2d2a8e0bd8c26c06

}
