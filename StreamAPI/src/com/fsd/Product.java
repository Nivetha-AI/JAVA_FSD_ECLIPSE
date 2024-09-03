package com.fsd;

public class Product{
	//public class Product implements Comparable<Product>{// comparable code
	int code;
	Double Price;
	String name;

	public Product() {

	}

	public Product(int code, Double price, String name) {
		super();
		this.code = code;
		Price = price;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", Price=" + Price + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Product o) {
//		return this.name.compareTo(o.name);
//		
//		//return this.code-o.code;// asc
//		//return o.code-this.code;// dsc
//	}

}
