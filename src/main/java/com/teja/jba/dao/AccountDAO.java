package com.teja.jba.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() throws Exception{
		System.out.println("Account has been created..."+getClass());
		throw new Exception();
		
	}
	
	
}
