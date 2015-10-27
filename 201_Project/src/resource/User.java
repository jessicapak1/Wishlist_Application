package resource;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private static final long serialVersionUID = 1234567890L;
	String firstName, lastName, userName, email;
	long password;
	Double balance;
	Date birthday;
	Image profilePicture;
	
	public User() {
		
	}
	
	public User(String un, long p) {
		userName = un;
		password = p;
	}
	public User(String first, String last, long pw, String un,
			String em, Date d, Image pic, Double b) {
		firstName = first;
		lastName = last;
		userName = un;
		email = em;
		password = pw;
		balance = b;
		birthday = d;
		profilePicture = pic;
	}
	
	// setters
	public void setName(String f, String l) { firstName = f; lastName = l; }
	public void setUserName(String s) { userName = s; }
	public void setPassword(long s) { password = s; }
	public void setBalace(Double s) { balance = s; }
	public void setDate(Date s) { birthday = s; }
	public void setProfilePic(Image s) { profilePicture = s; }
	public void setEmail(String s) { email = s; }
	// getters
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getEmail() { return email; }
	public String getUserName() { return userName; }
	public long getPassword() { return password; }
	public Double getBalance() { return balance; }
	public Date getBirthday() { return birthday; }
	public Image getProfilePic() { return profilePicture; }
	

}
