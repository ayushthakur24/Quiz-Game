package Bean;

public class User {
String user;
String password;
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
/**
 * 
 */
public User() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param user
 * @param password
 */
public User(String user, String password) {
	super();
	this.user = user;
	this.password = password;
}

}
