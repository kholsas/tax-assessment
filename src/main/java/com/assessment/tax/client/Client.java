package com.assessment.tax.client;

import com.assessment.tax.entity.*;
import com.assessment.tax.entity.Item.*;
import com.assessment.tax.service.*;
import com.assessment.tax.service.impl.*;

public class Client {

	public static void main(String[] args) {
	TellerMachineService tellMachine = new TellerMachineServiceImpl();

	tellMachine.addItem(new Item(11L, "Book", ItemType.BOOK, false, 12.49, 1));
	tellMachine.addItem(new Item(12L, "Music CD", ItemType.OTHER, false, 14.99, 1));
	tellMachine.addItem(new Item(13L, "Chocolate Bar", ItemType.FOOD, false, 0.85, 1));
	
	tellMachine.printTotalTaxAmount();
	
	}

}
