package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class LoginPage 
{
	@FindBy(id="email")
   private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(name="login")
	private WebElement login;
	public LoginPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}
	}