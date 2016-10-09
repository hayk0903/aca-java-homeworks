package edu.zoo.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.zoo.booth.TicketBooth;
import edu.zoo.booth.Zoo;



public class ZooDriver {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("booth.xml");
		TicketBooth booth = context.getBean("zooBooth",Zoo.class);
		booth.sellTicket(50);
		System.out.println(booth);
		    
	}

}
