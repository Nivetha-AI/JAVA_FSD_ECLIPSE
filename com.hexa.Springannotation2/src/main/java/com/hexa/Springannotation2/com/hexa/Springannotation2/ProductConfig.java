package com.hexa.Springannotation2.com.hexa.Springannotation2;

import org.springframework.context.annotation.Bean;


public class ProductConfig {
	@Bean(name="prod1",initMethod="init", destroyMethod="destroy")
	public Product getProduct() {
		Product p1=new Product();
		p1.setName("TV");
		p1.setPrice(2000.0);
		return p1;
		
	}
	@Bean(name="cart1")
	public Cart getCart() {
		Cart c1=new Cart();
		c1.setQty(5);
		c1.setBill(10000);
		return c1;
		
	}
	
	
}
