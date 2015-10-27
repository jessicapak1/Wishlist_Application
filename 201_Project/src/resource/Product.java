package resource;

import java.awt.Image;
import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = 1234567890L;
	String name, description;
	Double price;
	Image productImage;
	
	public Product() {
		
	}
	
	public Product(String n, String d, Double p, Image i) {
		name = n;
		description = d;
		price = p;
		productImage = i;
	}
	
	public Product(String n, Double p) {
		name = n;
		price = p;
	}
	
	// setters
	public void setName(String n) { name = n; } 
	public void setDescription(String n) { description = n; } 
	public void setPrice(Double n) { price = n; } 
	public void setProductImage(Image n) { productImage = n; } 
	// getters
	public String getName() { return name; }
	public String getDescription() { return description; }
	public Double getPrice() { return price; }
	public Image getProductImage() { return productImage; }
}


