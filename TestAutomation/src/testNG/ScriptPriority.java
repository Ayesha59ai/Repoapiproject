package testNG;

import org.testng.annotations.Test;

public class ScriptPriority {
	@Test (priority = 0)
	public void signup() {
		System.out.println("Signup is displayed");
	}
	@Test (priority = 1)
	public void login() {
		System.out.println("login is displayed");
	}
	@Test(priority = 2)
	public void homepg() 
	{
	System.out.println("home pg is displayed");	
	}
@Test (priority = 3)
public void logout() {
	System.out.println("logout is displayed");
}
}
