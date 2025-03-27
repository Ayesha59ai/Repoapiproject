package BasicFramework;

import org.testng.annotations.Test;

public class Testcase05 extends Genericscript 
{
	@Test
	public void url() 
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
