package Api_runner;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.Shopper_register;
import Property_util.get_property;
import Spec_builder_generic.Shopper_Spec_builder;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Register_shopper 
{
	@Test
	public void create() throws IOException 
	{
		String random = RandomStringUtils.randomAlphanumeric(4);
		String randemail = "Ayesha"+random+"@gmail.com";
		//pojo
		Shopper_register sp = new Shopper_register();
		sp.setCity("Bangalore");
		sp.setCountry("India");
		sp.setEmail( randemail);
		sp.setFirstName("Ayesha");
		sp.setGender("FEMALE");
		sp.setLastName("fathima");
		sp.setPassword("Ayesha@346");
		sp.setPhone("6047829741");
		sp.setState("Karnataka");
		sp.setZoneId("ALPHA");
		//converting java to json
		ObjectMapper obj=new ObjectMapper();
		String jsonbody = obj.writeValueAsString(sp);
		//getproperty
		get_property get = new get_property();
		String url = get.getdata("baseurl");
		String endpoint = get.getdata("registerendpoint");
		String content = get.getdata("contenttype");
		
		//spec
		Shopper_Spec_builder spec = new Shopper_Spec_builder();
		RequestSpecification req = spec.request(url, jsonbody, content);
		
		ResponseSpecification res = spec.response(201, "HTTP/1.1 201 ", 3000l);
		
		
		RestAssured.given().relaxedHTTPSValidation().spec(req).when().post(endpoint).then().spec(res).log().all();
	}
}