package resource;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

public class Wishlist implements Serializable{
	private static final long serialVersionUID = 1234567890L;
	private User user;
	private String title;
	private Date expDate;
	private Vector<Product> products;
	private boolean isPublic;
	private Vector<User> sharedUsers;
	
	public Wishlist() {
		
	}
	
	public Wishlist(User u, String t, Vector<Product> vp, boolean b) {
		user = u;
		title = t;
		products = vp;
		isPublic = b;
	}
	
	public Wishlist(User u, String t, Vector<Product> vp, 
			Vector<User> vu, boolean b, Date d) {
		user = u;
		title = t;
		products = vp;
		isPublic = b;
		expDate = d;
		sharedUsers = vu;
	}
	
	// setters
	public void setUser(User u) { user = u; }
	public void setTitle(String t) { title = t; }
	public void setDate(Date d) { expDate = d; }
	public void setProducts(Vector<Product> vp) { products = vp; }
	public void setPublic(boolean b) { isPublic = b; }
	public void setSharedUsers(Vector<User> vp) { sharedUsers = vp; }
	
	// getters
	public User getUser() { return user; }
	public String getTitle() { return title; }
	public Date getExpDate() { return expDate; }
	public Vector<Product> getProducts() { return products;}
	public boolean getIsPublic() { return isPublic; }
	public Vector<User> getSharedUsers() { return sharedUsers; }
	
}
