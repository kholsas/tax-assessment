package com.assessment.tax.client.converters;

import com.assessment.tax.entity.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InputConverter {

    public static String getFormattedAmount(double amount) {

        int wholeAmount = (int) (amount * 100);

        int remainder = wholeAmount % 10;
        wholeAmount /= 10;
        if (remainder > 0 && remainder <= 5) {
            wholeAmount *= 10;
            wholeAmount += 5;
        } else {
            wholeAmount *= 10;
            wholeAmount += 10;
        }

        return String.format("%.2f", wholeAmount / 100d);
    }

    public static List<Item> getItemsFromText() {
        final List<Item> listOfItems = new ArrayList<Item>();

        final Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter the number of items to process: ");
        int numOfItems = keyboardScanner.nextInt();
        System.out.println("\n\n");

        for (int i = 0; i < numOfItems; i++) {
            keyboardScanner.nextLine();
            System.out.println("Item number : " + (i + 1) + "\n");
            final Item item = new Item();
            item.setId(new Random().nextInt(10000000));
            System.out.println("Enter the name of the product: ");
            item.setItemName(keyboardScanner.nextLine());
            System.out.println("Enter quantity: ");
            item.setQuantity(keyboardScanner.nextInt());
            System.out.println("Enter price per item");
            item.setPrice(keyboardScanner.nextDouble());
            System.out.println("Is this an imported product? Y/N");
            item.setImported(keyboardScanner.next().equalsIgnoreCase("Y"));
            System.out.println("Which of the following categories is the product?\n Food, Medical , Book , Other");
            item.setType(Item.ItemType.valueOf(keyboardScanner.next().toUpperCase()));
            System.out.println("\n\n");
            listOfItems.add(item);
        }

        return listOfItems;
    }
}
