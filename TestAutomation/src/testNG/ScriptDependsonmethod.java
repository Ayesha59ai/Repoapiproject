package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScriptDependsonmethod {
	@Test
	public void signup()
	{
		System.out.println("signup is success");
	}
		@Test (dependsOnMethods = "signup")
		public void login() {
			Assert.fail();
			System.out.println("login is success");
		}
		@Test(dependsOnMethods = "login")
		public void home() {
			System.out.println("home is success");
		}
		@Test(dependsOnMethods = "home")
		public void logout() {
			System.out.println("logout is success");
		}
	

}
