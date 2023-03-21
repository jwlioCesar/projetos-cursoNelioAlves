package application;

import java.util.Date;

import entities.Order;
import entities_enum.orderStatus;

public class program {

	public static void main(String[] args) {

	Order order = new Order(1098, new Date(), orderStatus.DELIVERED);	
		
	System.out.println(order);
	
	}

}
