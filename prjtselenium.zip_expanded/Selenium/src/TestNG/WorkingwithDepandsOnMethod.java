package TestNG;

import org.testng.annotations.Test;

public class WorkingwithDepandsOnMethod {
	@Test  
	public void bLogin() {
		System.out.println("Login done");
	}
	
	@Test (dependsOnMethods = "bLogin")
	public void aplaceOrder() {
		System.out.println("order placed");

}
}