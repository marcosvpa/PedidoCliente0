package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Order {
	
	public Date moment ;
	public OrderStatus status;
	public Client client = new Client();
	public List <OrderItem> orderList = new ArrayList<OrderItem>();
	public Double total;

	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	

	Scanner sc = new Scanner (System.in);
	
	public void registerItem () {
		OrderItem newItem = new OrderItem();
		System.out.print("Product name:");
			newItem.product.setName(sc.next());
		System.out.print("Product price:");
			newItem.product.setPrice(sc.nextDouble());
		System.out.print("Quantity:");
			newItem.setQuantities(sc.nextInt());
		orderList.add(newItem);
	}

	public double getTotal () {
		for (OrderItem item:orderList) {
			total += item.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY \n");
		sb.append("Order moment:" + sdf2.format(moment) + "\n");
		sb.append("Order status:"+ status +"\n");
		
		sb.append("Client: "+client.getName()+"("
		+sdf1.format(client.getBirthDate())+")" +"-"+client.getEmail()+"\n");
		
		sb.append("Order items:\n");
		
		for (OrderItem item:orderList) {
			sb.append(item.product.name + ","+"$"+item.product.price+
					","+" Quantity: "+item.quantities+" Subtotal: $"+item.subTotal() +"\n");

		}
		sb.append("Total Price: $"+getTotal());
		return sb.toString();
	}
	
	

	
}
