package encapsulation;

import java.sql.Date;

public class User {
	private String userName;
	private String pass;
	private String fname;
	private String lname;
	private Date dateOfBirth;
	private String address;
	
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getpass() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}
	
	
}
