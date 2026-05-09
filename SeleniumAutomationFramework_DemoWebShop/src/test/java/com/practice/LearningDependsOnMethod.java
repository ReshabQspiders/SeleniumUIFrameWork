package com.practice;

import org.testng.annotations.Test;

public class LearningDependsOnMethod {
	@Test(priority = 1)
	public void createContact() {
		System.out.println("Creating a new contact");
	}
	@Test(priority = 2,dependsOnMethods = "createContact")
	public void editContact() {
		System.out.println("Editing an existing contact");
	}
	@Test(priority = 3,dependsOnMethods = {"createContact","editContact"})
	public void deleteContact() {
		System.out.println("Delete a contact");
	}
	@Test(priority = 4)
	public void viewContactHistory() {
		System.out.println("Viewing histoy of the contacts");
	}

}
