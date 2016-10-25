package com.accenture.adf.autowiring.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.adf.autowiring.model.Country;

public class ConCapClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext container= new ClassPathXmlApplicationContext("Spring-config.xml");
		Country india=(Country) container.getBean("country");
		
		System.out.println("Country name= "+india.getName());
		System.out.println("Country Capital= "+india.getCapital().getCapName());
		System.out.println("Capital Population= "+india.getCapital().getPopu());
		System.out.println("State= "+india.getState().getsName());
	}

}
