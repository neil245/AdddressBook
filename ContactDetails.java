package com.addressbook;

public class ContactDetails {
private String firstName;
private String lastName;
private String city;
private String state;
private int zip;
private long phoneNumber;
private String eMail;
public ContactDetails(String firstName2, String lastName2, long phoneNumber2, String eMail2, String city2,
		String state2, int zip2) {
	this.setFirstName(firstName2);
	this.setLastName(lastName2);
	this.setPhoneNumber(phoneNumber2);
	this.seteMail(eMail2);
	
	this.setCity(city2);
	this.setState(state2);
	this.setZip(zip);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}

@Override
public String toString() {
	return "ContactDetails--> \n firstName=" + getFirstName() + "\n lastName=" + getLastName() + "\n phoneNumber=" + getPhoneNumber()
			+ "\n eMail=" + geteMail()+"\n city=" + getCity() + "\n state=" + getState() + "\n zip=" + getZip();
}
}
