package testNG;

import org.testng.annotations.Test;

public class ScriptEnabled {
	@Test 
	public void signup() {
		System.out.println("Signup is displayed");
	}
	@Test 
	public void login() {
		System.out.println("login is displayed");
	}
	@Test(enabled = false)
	public void homepg() 
	{
	System.out.println("home pg is displayed");	
	}
@Test 
public void logout() {
	System.out.println("logout is displayed");
}


}
