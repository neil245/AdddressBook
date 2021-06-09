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
	public void editContact() {
		System.out.println("Enter first name");
		String inputValue = sc.nextLine();
		if(inputValue.equals(contactsList.get(0).getFirstName())) {
			System.out.println("Enter new first name");
			contactsList.get(0).setFirstName(sc.nextLine());
			System.out.println("Enter new last name");
			contactsList.get(0).setLastName(sc.nextLine());
			System.out.println("Enter new city");
			contactsList.get(0).setCity(sc.nextLine());
			System.out.println("Enter State");
			contactsList.get(0).setState(sc.next());
			System.out.println("Enter zip");
			contactsList.get(0).setZip(sc.nextInt());
			System.out.println("Enter PhoneNumber"); 
			contactsList.get(0).setPhoneNumber(sc.nextLong());
			System.out.println("Enter Email");
			contactsList.get(0).seteMail(sc.next()); 
			System.out.println(contactsList.get(0));
		}
		else {
			System.out.println("Contact not present");
		}
	}
	public void deleteContact() {
		sc.nextLine();
		String ipName1;
		String ipName2;
		System.out.println("Enter first name:");
		ipName1 = sc.nextLine();
		System.out.println("Enter last name:");
		ipName2 = sc.nextLine();
		if(ipName1.equals(contactsList.get(0).getFirstName()) && ipName2.equals(contactsList.get(0).getLastName())) {
			contactsList.remove(0);
			System.out.println("Contact Deleted!");
			System.out.println(contactsList);
		}else {
			
			System.out.println("No contact found in the book.");
		}
	}
}