package com.addressbook;

public class AddressBookMain {
	public static void main(String[] args) {
	System.out.println("Welcome to address book");
	AddressBook obj = new AddressBook();
	obj.addContact();
	obj.editContact();
	obj.deleteContact();
	}

}
