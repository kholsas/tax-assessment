package com.assessment.tax.service.impl;

import com.assessment.tax.entity.Item;
import com.assessment.tax.entity.Item.ItemType;
import com.assessment.tax.service.RulesService;

import java.util.List;

public class RuleServiceImpl implements RulesService {

    public double getTaxValueForItem(final Item item) {

        double importCharge = item.isImported() ? item.getPrice() * (0.05d) : 0d;
        double taxableItemCharge = item.getType() == ItemType.OTHER ? (item.getPrice() * (0.10d)) : 0d;
        final double valueAfterTax = item.getPrice() + importCharge + taxableItemCharge;

        item.setPriceAfterTax(valueAfterTax);
        return valueAfterTax;
    }

    public double getTotalTaxValue(final List<Item> items) {
        double totalTaxedAmount = 0;
        for (final Item item : items) {
            totalTaxedAmount += getTaxValueForItem(item);
        }
        return totalTaxedAmount;
    }

    @Override
    public double getTotalSalesTax(final List<Item> items) {
        getTotalTaxValue(items);
        double vat = 0;
        for (final Item item : items) {
            vat += item.getPriceAfterTax() - item.getPrice();
        }
        return vat;
    }
}
