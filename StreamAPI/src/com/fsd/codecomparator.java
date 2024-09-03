package com.fsd;

import java.util.Comparator;

public class codecomparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.code-o2.code;
	}

}
