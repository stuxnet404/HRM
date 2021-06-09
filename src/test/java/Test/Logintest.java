package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClassOHRM;
import POM.POMLOGIN;

public class Logintest extends BaseClassOHRM {
	POMLOGIN login;
	
	public Logintest() {
		super();
	}
	
    @BeforeMethod
    public void initial() {
    	initiate();
    	login();
    	login=new POMLOGIN();
    }
    @Test (priority=1)
    public void Title() {
    	String actual=login.verify();
    	System.out.println(actual);
    	String expected="OrangeHRM";
    	Assert.assertEquals(actual, expected);
    	}
     @Test(priority=2)
     public void TC1() {
    	 login.inputUsr(po.getProperty("username"));
    	 login.inputPassword(po.getProperty("password"));
    	 login.submit();
    	  }
     
			/*
			 * @AfterMethod public void close() { breakdown(); }
			 */
}
