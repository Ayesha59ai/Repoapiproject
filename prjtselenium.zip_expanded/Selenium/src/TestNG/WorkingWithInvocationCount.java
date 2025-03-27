package TestNG;

import org.testng.annotations.Test;

public class WorkingWithInvocationCount {
	@Test (invocationCount = 3)
	public void Registration() {
		System.out.println("Registration done");
	}
}
