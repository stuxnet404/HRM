package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClassOHRM;

public class POMLOGIN extends BaseClassOHRM {
	@FindBy(id="txtUsername")
	WebElement Username;
	@FindBy(name="txtPassword")
	WebElement Password;
	@FindBy(id="btnLogin")
	WebElement Submit;
	
	public POMLOGIN() {
		PageFactory.initElements(driver, this);
		
	}
 

	public void inputUsr(String u) {
		Username.sendKeys(u);
	}
	public void inputPassword(String p) {
		Password.sendKeys(p);
	}
	public void submit() {
		Submit.click();
	}
	public String verify() {
				String a=driver.getTitle();
		return a;
	}
}

