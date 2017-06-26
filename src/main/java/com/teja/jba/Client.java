package com.teja.jba;



import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teja.jba.dao.AccountDAO;
import com.teja.jba.dao.BankDAO;
import com.teja.pojo.User;

public class Client {

	
	
	public static void main(String [] args) throws Exception{	
		
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppCOnfig.class);
		AccountDAO accountdao=context.getBean("accountDAO", AccountDAO.class);
		BankDAO bakdao=context.getBean("bankDAO", BankDAO.class);
		
		accountdao.addAccount();
		bakdao.addAccount("teja");
		
		//context.close();
		
		
		
	}
	
}
