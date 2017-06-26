package com.teja.jba.dao;

import org.springframework.stereotype.Component;

@Component
public class BankDAO {

public void addAccount(String name){
		
		System.out.println("Bank Account has been created..."+name+getClass());
	}
}
