package TestScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	@Test
	public void testcase() {
		//path for reports
		ExtentSparkReporter sparkrepoter = new ExtentSparkReporter("./Reports/Demo.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(sparkrepoter);
		//name of the testcase
		ExtentTest test = reports.createTest("testcase01");
		
		test.log(Status.INFO, "LaunchingBrowser");
		test.log(Status.INFO, "performing Login");
		test.log(Status.INFO, "verifying home page is displayed");
		
		test.log(Status.INFO, "Testcase pass");
		reports.flush();
		
		
		
		
	}

}
