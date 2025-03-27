package Parallelexecution;

import org.testng.annotations.Test;

public class Testcase01login extends BaseScript
{

	@Test
	public void Login() 
	{
		Pom pm = new Pom(driver);
		
		pm.enterun();
		pm.enterpsw();
		pm.loginbtn();
		
	}
}
