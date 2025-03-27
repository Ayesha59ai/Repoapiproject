package Parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	

		@FindBy(id="email")
	   private WebElement usn;
		@FindBy(id="pass")
		private WebElement psw;
		@FindBy(name="login")
		private WebElement login;
		public Pom(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
		public void enterun() {
			usn.sendKeys("admin");
			;
		}
		public void enterpsw() {
			psw.sendKeys("admin123");
		}
		public void loginbtn() {
			login.click();
		}

	}

