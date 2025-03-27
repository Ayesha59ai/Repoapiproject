package TestNG;

import org.testng.annotations.Test;

public class WorkingwithEnabled {

	@Test (priority = 1)
	public void Registration() {
		System.out.println("Registration done");
	}
	@Test  (priority = 2)
	public void Login() {
		System.out.println("Login done");
	}
	@Test (enabled = false)
	public void addtocart() {
		System.out.println("product added to cart");
	}
	@Test (priority = 4)
	public void placeOrder() {
		System.out.println("order placed");
	}
	@Test (priority = 5)
	public void logout() {
		System.out.println("Logout done");
	}
	}


