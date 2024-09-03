package com.hex.hibernew.com.hext.hibernew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ITBook")
public class Book {
	@Id
	@GeneratedValue
	int Bno;
	 @Column(name="Name")
	String Name;
	 @Column(name="price")
	Double price;
	 @Transient   // not saving in backend
	 String subject;
	

	public int getBno() {
		return Bno;
	}

	public void setBno(int bno) {
		Bno = bno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Bno=" + Bno + ", Name=" + Name + ", price=" + price + "]";
	}

}
