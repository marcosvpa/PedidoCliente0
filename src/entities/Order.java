package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Order {

	Date moment ;
	OrderStatus status;
	Client client;
	List <Order> orderList = new ArrayList<Order>();

	
}
