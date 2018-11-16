package com.cust.test;

import com.cust.Cust;
import com.cust.CustBiz;

public class InsertTest {

	public static void main(String[] args) {
		CustBiz biz = new CustBiz();
		Cust cust = 
		new Cust("id04", "pwd04", "james4", 11);
		try {
			biz.register(cust);
			System.out.println("OK");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("FAIL");
		}
	}

}
