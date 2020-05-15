package entities;

public class OrderItem {
	
	 Integer quantities;
	 Product product = new Product();
		
	public Integer getQuantities() {
		return quantities;
	}
	public void setQuantities(Integer quantities) {
		this.quantities = quantities;
	}

	double subTotal() {
		 return quantities*product.price;
	}


}
