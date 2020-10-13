package java47;

public class BasketVO {
	private String product;
	private String price;
	
	
	
	@Override
	public String toString() {
		return "BasketVO [product=" + product + ", price=" + price + "]";
	}
	public BasketVO() {
		// TODO Auto-generated constructor stub
	}
	public BasketVO(String product, String price) {
		super();
		this.product = product;
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
