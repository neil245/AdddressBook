package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	List<ContactDetails> contactsList = new ArrayList<ContactDetails>();
	Scanner sc =  new Scanner(System.in);
	public void addContact() {
		System.out.println("Enter first Name");
		String firstName = sc.nextLine();
		System.out.println("Enter last name");
		String lastName = sc.nextLine();
		System.out.println("Enter City:");
		String city = sc.nextLine();
		System.out.println("Enter state:");
		String state= sc.nextLine();
		System.out.println("Enter zip code");
		int zip = sc.nextInt();
		System.out.println("Enter email");
		String eMail = sc.next();
		System.out.println("Enter Mobile number");
		long phoneNumber = sc.nextLong();
		ContactDetails contactdetails =  new ContactDetails(firstName, lastName, phoneNumber, eMail,city,state,zip);
		contactsList.add(contactdetails);
		System.out.println(contactsList);
		
	}
}