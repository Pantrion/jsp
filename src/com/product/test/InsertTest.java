package com.product.test;

import com.product.Product;
import com.product.ProductBiz;

public class InsertTest {

	public static void main(String[] args) {
		ProductBiz biz = new ProductBiz();
		Product product = 
		new Product("id20",10000,"aa.jpg");
		
		try {
			biz.register(product);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fail");
		}
	}

}
