package com.assessment.tax.client;

import com.assessment.tax.client.converters.InputConverter;
import com.assessment.tax.service.TellerMachineService;
import com.assessment.tax.service.impl.TellerMachineServiceImpl;

public class Client {

    public static void main(String[] args) {
        TellerMachineService tellMachine = new TellerMachineServiceImpl();

        tellMachine.addAllItems(InputConverter.getItemsFromText());
        tellMachine.printSlip();
    }

}
