package com.assessment.tax.data.impl;

import com.assessment.tax.data.DataManager;
import com.assessment.tax.entity.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DataManagerImplTest {
    private DataManager dataManager;

    @Before
    public void setUp() {
        dataManager = new DataManagerImpl();
    }

    @Test
    public void testAddItemNoItems() throws Exception {
        Assert.assertEquals(0, dataManager.getAllItems().size());
    }

    @Test
    public void testAddItemOneITem() throws Exception {
        dataManager.addItem(new Item());
        Assert.assertEquals(1, dataManager.getAllItems().size());
    }

    @Test
    public void testAddDublicateItem() throws Exception {
        final Item item = new Item();
        item.setId(11L);
        dataManager.addItem(item);
        dataManager.addItem(item);
        Assert.assertEquals(1, dataManager.getAllItems().size());
    }

    @Test
    public void testRemoveItem() throws Exception {
        final Item item = new Item();
        item.setId(11L);
        dataManager.addItem(item);
        Assert.assertEquals(1, dataManager.getAllItems().size());
        dataManager.removeItem(11L);
        Assert.assertEquals(0, dataManager.getAllItems().size());

    }

    @Test
    public void testGetAllItems() throws Exception {
         Item item = new Item();
        item.setId(11L);
        dataManager.addItem(item);
        item = new Item();
        item.setId(23L);
        dataManager.addItem(item);
        Assert.assertEquals(2, dataManager.getAllItems().size());
    }

    @Test
    public void testGetItemsOfType() throws Exception {
        Item item = new Item();
        item.setId(11L);
        item.setType(Item.ItemType.OTHER);
        dataManager.addItem(item);

        Item item2 = new Item();
        item2.setId(21L);
        item2.setType(Item.ItemType.FOOD);
        dataManager.addItem(item2);

        Assert.assertNotNull(dataManager.getItemsOfType(Item.ItemType.FOOD).get(0));
        Assert.assertEquals(item2 , dataManager.getItemsOfType(Item.ItemType.FOOD).get(0));
    }
}