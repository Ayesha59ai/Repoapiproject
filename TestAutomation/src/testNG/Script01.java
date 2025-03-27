package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script01 {
	@Test
	public void Testcase() {
		
		Reporter.log("Hi",true);
		
	}
	@Test
	public void Testcase1()
	{
		Reporter.log("Goodmorning",true);
	}

}
