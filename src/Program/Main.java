package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.OrderStatus;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner (System.in);
		
		Order newOrder = new Order();
		
		newOrder.moment = new Date();
		
		System.out.println("Enter client data:");
		
		System.out.print("Name:");
		newOrder.client.setName(sc.nextLine());

		System.out.print("Email:");
		newOrder.client.setEmail(sc.next());

		System.out.print("Birth Date:");
		newOrder.client.setBirthDate(sdf1.parse(sc.next()));

		System.out.print("Status:");
		newOrder.status = OrderStatus.valueOf(sc.next());
		
		
		System.out.print("How many items to this order?");
		 int orderNumber = sc.nextInt();
		 
		 for (int i = 0;i< orderNumber;i++) {
			 int count = i+1;
			 System.out.println("Enter #"+count+" item data:");
			 newOrder.registerItem();
		 }
		 
		 
		 newOrder.getTotal();
		 
		System.out.printf("%s",newOrder);
		
		
		sc.close();
	}

}
