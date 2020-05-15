package entities;

public class OrderItem {
	
	Integer quantities;
	Product product;
	
	public OrderItem(Integer quantities, Product product) {
		super();
		this.quantities = quantities;
		this.product = product;
	}
	
	public Integer getQuantities() {
		return quantities;
	}
	public void setQuantities(Integer quantities) {
		this.quantities = quantities;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	double subTotal() {
		 return quantities*product.price;
	}


}
