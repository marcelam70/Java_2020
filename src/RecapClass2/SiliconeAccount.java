package RecapClass2;
public class SiliconeAccount{
private String email;
private String firstName;
private String password;

public void setAccountInfo(String email, String firstName, String password) {
	this.email = email;
	this.firstName = firstName;
	this.password = password;
}
public String getAccountInfo() {
	return this.email + " |" + firstName + " |"+ password;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */

public void setPassword(String password) {
	if(password.length() <6) {
		System.out.println("Password must be at least 6 characters");
		return;
	}
	this.password = password;
}

}