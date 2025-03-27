package Spec_builder_generic;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Shopper_Spec_builder 
{
	@BeforeMethod
	public RequestSpecification request(String url,String body,String content) {
		
		RequestSpecBuilder re=new RequestSpecBuilder();
		RequestSpecification req = re.setBaseUri(url).setBody(body).setContentType(content).build();
		return req;
	}
	@AfterMethod
	public ResponseSpecification response(int statuscode,String statusline,long time) 
	{
		ResponseSpecBuilder re=new ResponseSpecBuilder();
		ResponseSpecification res = re.expectStatusCode(statuscode).expectStatusLine(statusline).
		expectResponseTime(Matchers.lessThanOrEqualTo(time)).build();
		return res;
		
	}
}