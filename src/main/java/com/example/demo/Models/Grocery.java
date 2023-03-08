package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grocery {
@Id
   private int Sno;
   private int Id;
   private String ItemName;
   private String Purchasedate;
   private int Price;
public Grocery(int sno, int id, String itemName, String purchasedate, int price) {
	super();
	Sno = sno;
	Id = id;
	ItemName = itemName;
	Purchasedate = purchasedate;
	Price = price;
}
public Grocery() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSno() {
	return Sno;
}
public void setSno(int sno) {
	Sno = sno;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getItemName() {
	return ItemName;
}
public void setItemName(String itemName) {
	ItemName = itemName;
}
public String getPurchasedate() {
	return Purchasedate;
}
public void setPurchasedate(String purchasedate) {
	Purchasedate = purchasedate;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
}
