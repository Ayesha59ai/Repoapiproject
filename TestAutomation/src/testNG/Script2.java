package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script2 {
	
 @Test(invocationCount = 1)
 public void Testcase() {
	 Reporter.log("GoodMorning",true);
	 
 }
 @Test(invocationCount =0)
 public void Testcase2() {
	 Reporter.log("Good",true);
 }

}
