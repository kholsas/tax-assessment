package com.assessment.tax.entity;

public class Item {

	
	private long id;
	private String itemName;
	private ItemType type;
	private boolean imported;
	private double price;
	private int quantity;
	


	public Item(long id, String itemName, ItemType type, boolean imported, double price, int quantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.type = type;
		this.imported = imported;
		this.price = price;
		this.quantity = quantity;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public double getPrice() {
		return price * quantity;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public ItemType getType() {
		return type;
	}




	public void setType(ItemType type) {
		this.type = type;
	}




	public boolean isImported() {
		return imported;
	}




	public void setImported(boolean imported) {
		this.imported = imported;
	}




	public enum ItemType{
		BOOK,
		FOOD, 
		MEDICAL,
		OTHER
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
